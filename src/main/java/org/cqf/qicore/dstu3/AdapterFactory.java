package org.cqf.qicore.dstu3;

import ca.uhn.fhir.model.api.IResource;
import org.hl7.fhir.dstu3.model.Bundle;
import org.slf4j.LoggerFactory;
import java.util.List;

import org.slf4j.Logger;
import java.util.Map;

public class AdapterFactory
{

   static public final String GENERATED_PACKAGE_PREFIX = "org.socraticgrid.fhir.dstu3.generated.";
   static public final String HAPI_FHIR_RESOURCE_PREFIX = "ca.uhn.fhir.model.dstu2.resource.";
   static public final Logger LOGGER = LoggerFactory
         .getLogger(AdapterFactory.class);

   public static Map adapt(org.hl7.fhir.dstu3.model.Bundle bundle) {
		Map<String, List<?>> adapteeMap = new java.util.HashMap<>();
		for (Bundle.BundleEntryComponent entry : bundle.getEntry()) {
			Object adapter = adapt(entry.getResource());
			if (adapter != null) {
				List list = adapteeMap.get(entry.getResource().getClass()
						.getCanonicalName());
				if (list == null) {
					list = new java.util.ArrayList();
					adapteeMap.put(entry.getResource().getClass()
							.getCanonicalName(), list);
				}
				list.add(adapter);
			}
		}
		return adapteeMap;
	}

   public static Object adapt(org.hl7.fhir.dstu3.model.Resource resource)
   {
      Object adapter = null;
      String adapterName = resource.getResourceType().name() + "Adapter";
      String resourceName = resource.getResourceType().name();
      try
      {
         Class clazz = Class.forName(GENERATED_PACKAGE_PREFIX + adapterName);
         adapter = clazz.newInstance();
         Class[] args = new Class[1];
         args[0] = Class.forName(HAPI_FHIR_RESOURCE_PREFIX + resourceName);
         java.lang.reflect.Method method = clazz.getDeclaredMethod(
               "setAdaptee", args);
         Object[] resourceArray = new Object[1];
         resourceArray[0] = resource;
         method.invoke(adapter, resourceArray);
      }
      catch (Exception e)
      {
         LOGGER.error("Unable to adapt " + resourceName, e);
      }
      return adapter;
   }
}
