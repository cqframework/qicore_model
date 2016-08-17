package org.socraticgrid.fhir.generated;

import java.util.List;
import ca.uhn.fhir.model.dstu2.composite.CodeableConceptDt;
import ca.uhn.fhir.model.primitive.IdDt;
import ca.uhn.fhir.model.dstu2.valueset.DiagnosticOrderStatusEnum;
import ca.uhn.fhir.model.primitive.BoundCodeDt;
import ca.uhn.fhir.model.api.ExtensionDt;
import ca.uhn.fhir.model.dstu2.resource.*;

public class QICoreDiagnosticOrderItem
{

   private DiagnosticOrder.Item adaptedClass = null;

   public QICoreDiagnosticOrderItem()
   {
      this.adaptedClass = new ca.uhn.fhir.model.dstu2.resource.DiagnosticOrder.Item();
   }

   public QICoreDiagnosticOrderItem(DiagnosticOrder.Item adaptee)
   {
      this.adaptedClass = adaptee;
   }

   public DiagnosticOrder.Item getAdaptee()
   {
      return adaptedClass;
   }

   public void setAdaptee(DiagnosticOrder.Item param)
   {
      this.adaptedClass = param;
   }

   public List<CodeableConceptDt> getPrecondition() {
		List<ca.uhn.fhir.model.api.ExtensionDt> extensions = adaptedClass
				.getUndeclaredExtensionsByUrl("http://hl7.org/fhir/StructureDefinition/diagnosticorder-precondition");
		List<ca.uhn.fhir.model.dstu2.composite.CodeableConceptDt> returnList = new java.util.ArrayList<>();
		for (ca.uhn.fhir.model.api.ExtensionDt extension : extensions) {
			ca.uhn.fhir.model.dstu2.composite.CodeableConceptDt item = (ca.uhn.fhir.model.dstu2.composite.CodeableConceptDt) extension
					.getValue();
			returnList.add(item);
		}
		return returnList;
	}

   public QICoreDiagnosticOrderItem setPrecondition(
         List<CodeableConceptDt> param)
   {
      if (param != null && param.size() > 0)
      {
         for (int index = 0; index < param.size(); index++)
         {
            ca.uhn.fhir.model.api.ExtensionDt extension = new ca.uhn.fhir.model.api.ExtensionDt();
            extension
                  .setUrl("http://hl7.org/fhir/StructureDefinition/diagnosticorder-precondition");
            extension.setValue(param.get(index));
            adaptedClass.addUndeclaredExtension(extension);
         }
      }
      return this;
   }

   public IdDt getId()
   {
      return adaptedClass.getId();
   }

   public QICoreDiagnosticOrderItem setId(IdDt param)
   {
      adaptedClass.setId(param);
      return this;
   }

   public String getStatus()
   {
      return adaptedClass.getStatus();
   }

   public QICoreDiagnosticOrderItem setStatus(String param)
   {
      adaptedClass
            .setStatus(ca.uhn.fhir.model.dstu2.valueset.DiagnosticOrderStatusEnum
                  .valueOf(param));
      return this;
   }

   public QICoreDiagnosticOrderItem setStatus(DiagnosticOrderStatusEnum param)
   {
      adaptedClass.setStatus(param);
      return this;
   }

   public BoundCodeDt<DiagnosticOrderStatusEnum> getStatusElement()
   {
      return adaptedClass.getStatusElement();
   }

   public QICoreDiagnosticOrderItem setStatus(
         BoundCodeDt<DiagnosticOrderStatusEnum> param)
   {
      adaptedClass.setStatus(param);
      return this;
   }

   public CodeableConceptDt getCode()
   {
      return adaptedClass.getCode();
   }

   public QICoreDiagnosticOrderItem setCode(CodeableConceptDt param)
   {
      adaptedClass.setCode(param);
      return this;
   }

   public CodeableConceptDt getBodySite()
   {
      return adaptedClass.getBodySite();
   }

   public QICoreDiagnosticOrderItem setBodySite(CodeableConceptDt param)
   {
      adaptedClass.setBodySite(param);
      return this;
   }
}