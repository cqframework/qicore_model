package org.socraticgrid.fhir.generated;

import ca.uhn.fhir.model.api.ExtensionDt;
import ca.uhn.fhir.model.dstu2.resource.BaseResource;
import ca.uhn.fhir.model.primitive.StringDt;
import ca.uhn.fhir.model.dstu2.composite.CodeableConceptDt;
import ca.uhn.fhir.model.dstu2.composite.PeriodDt;

public class QICorePatientClinicalTrial
{

   public static final String uri = "http://hl7.org/fhir/StructureDefinition/patient-clinicalTrial";
   private ExtensionDt rootObjectExtension = new ExtensionDt(false, uri);

   public ExtensionDt getRootObjectExtension()
   {
      return rootObjectExtension;
   }

   public void setRootObjectExtension(ExtensionDt rootObjectExtension)
   {
      this.rootObjectExtension = rootObjectExtension;
   }

   public ExtensionDt bindTemplateToParent(BaseResource containingResource)
   {
      rootObjectExtension = new ExtensionDt(false, uri);
      containingResource.addUndeclaredExtension(rootObjectExtension);
      return rootObjectExtension;
   }

   public StringDt getNCT()
   {
      ca.uhn.fhir.model.primitive.StringDt returnValue;
      java.util.List<ExtensionDt> extensions = rootObjectExtension
            .getUndeclaredExtensionsByUrl("http://hl7.org/fhir/StructureDefinition/patient-clinicalTrial#NCT");
      if (extensions.size() == 1)
      {
         returnValue = (ca.uhn.fhir.model.primitive.StringDt) extensions
               .get(0).getValue();
      }
      else if (extensions.size() == 0)
      {
         returnValue = null;
      }
      else
      {
         throw new IllegalStateException(
               "More than one extension specified for this object.");
      }
      return returnValue;
   }

   public QICorePatientClinicalTrial setNCT(StringDt param)
   {
      java.util.List<ExtensionDt> extensions = rootObjectExtension
            .getUndeclaredExtensionsByUrl("http://hl7.org/fhir/StructureDefinition/patient-clinicalTrial#NCT");
      if (extensions.size() == 1)
      {
         extensions.get(0).setValue(param);
      }
      else if (extensions.size() == 0)
      {
         ExtensionDt newExtension = new ExtensionDt(
               false,
               "http://hl7.org/fhir/StructureDefinition/patient-clinicalTrial#NCT",
               param);
         rootObjectExtension.addUndeclaredExtension(newExtension);
      }
      else
      {
         throw new IllegalStateException(
               "More than one extension specified for this object.");
      }
      return this;
   }

   public CodeableConceptDt getReason()
   {
      ca.uhn.fhir.model.dstu2.composite.CodeableConceptDt returnValue;
      java.util.List<ExtensionDt> extensions = rootObjectExtension
            .getUndeclaredExtensionsByUrl("http://hl7.org/fhir/StructureDefinition/patient-clinicalTrial#reason");
      if (extensions.size() == 1)
      {
         returnValue = (ca.uhn.fhir.model.dstu2.composite.CodeableConceptDt) extensions
               .get(0).getValue();
      }
      else if (extensions.size() == 0)
      {
         returnValue = null;
      }
      else
      {
         throw new IllegalStateException(
               "More than one extension specified for this object.");
      }
      return returnValue;
   }

   public QICorePatientClinicalTrial setReason(CodeableConceptDt param)
   {
      java.util.List<ExtensionDt> extensions = rootObjectExtension
            .getUndeclaredExtensionsByUrl("http://hl7.org/fhir/StructureDefinition/patient-clinicalTrial#reason");
      if (extensions.size() == 1)
      {
         extensions.get(0).setValue(param);
      }
      else if (extensions.size() == 0)
      {
         ExtensionDt newExtension = new ExtensionDt(
               false,
               "http://hl7.org/fhir/StructureDefinition/patient-clinicalTrial#reason",
               param);
         rootObjectExtension.addUndeclaredExtension(newExtension);
      }
      else
      {
         throw new IllegalStateException(
               "More than one extension specified for this object.");
      }
      return this;
   }

   public PeriodDt getPeriod()
   {
      ca.uhn.fhir.model.dstu2.composite.PeriodDt returnValue;
      java.util.List<ExtensionDt> extensions = rootObjectExtension
            .getUndeclaredExtensionsByUrl("http://hl7.org/fhir/StructureDefinition/patient-clinicalTrial#period");
      if (extensions.size() == 1)
      {
         returnValue = (ca.uhn.fhir.model.dstu2.composite.PeriodDt) extensions
               .get(0).getValue();
      }
      else if (extensions.size() == 0)
      {
         returnValue = null;
      }
      else
      {
         throw new IllegalStateException(
               "More than one extension specified for this object.");
      }
      return returnValue;
   }

   public QICorePatientClinicalTrial setPeriod(PeriodDt param)
   {
      java.util.List<ExtensionDt> extensions = rootObjectExtension
            .getUndeclaredExtensionsByUrl("http://hl7.org/fhir/StructureDefinition/patient-clinicalTrial#period");
      if (extensions.size() == 1)
      {
         extensions.get(0).setValue(param);
      }
      else if (extensions.size() == 0)
      {
         ExtensionDt newExtension = new ExtensionDt(
               false,
               "http://hl7.org/fhir/StructureDefinition/patient-clinicalTrial#period",
               param);
         rootObjectExtension.addUndeclaredExtension(newExtension);
      }
      else
      {
         throw new IllegalStateException(
               "More than one extension specified for this object.");
      }
      return this;
   }
}