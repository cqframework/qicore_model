package org.cqf.qicore.dstu3;

import org.hl7.fhir.dstu3.model.Extension;
import org.hl7.fhir.dstu3.model.DomainResource;
import org.hl7.fhir.dstu3.model.StringType;
import java.util.List;
import org.hl7.fhir.dstu3.model.CodeableConcept;
import org.hl7.fhir.dstu3.model.Period;

public class qicorepatientClinicalTrialAdapter
{

   public static final String uri = "http://hl7.org/fhir/StructureDefinition/patient-clinicalTrial";
   private Extension rootObjectExtension = new Extension(uri);

   public Extension getRootObjectExtension()
   {
      return rootObjectExtension;
   }

   public void setRootObjectExtension(Extension rootObjectExtension)
   {
      this.rootObjectExtension = rootObjectExtension;
   }

   public Extension bindTemplateToParent(DomainResource containingResource)
   {
      rootObjectExtension = new Extension(uri);
      containingResource.getExtension().add(rootObjectExtension);
      return rootObjectExtension;
   }

   public StringType getNCT()
   {
      List<org.hl7.fhir.dstu3.model.Extension> extensions = rootObjectExtension
            .getExtensionsByUrl("http://hl7.org/fhir/StructureDefinition/patient-clinicalTrial#NCT");
      if (extensions == null || extensions.size() <= 0)
      {
         return null;
      }
      else if (extensions.size() == 1)
      {
         return (org.hl7.fhir.dstu3.model.StringType) extensions.get(0)
               .getValue();
      }
      else
      {
         throw new RuntimeException("More than one extension exists for NCT");
      }
   }

   public qicorepatientClinicalTrialAdapter setNCT(StringType param)
   {
      rootObjectExtension
            .addExtension()
            .setUrl("http://hl7.org/fhir/StructureDefinition/patient-clinicalTrial#NCT")
            .setValue(param);
      return this;
   }

   public CodeableConcept getReason()
   {
      List<org.hl7.fhir.dstu3.model.Extension> extensions = rootObjectExtension
            .getExtensionsByUrl("http://hl7.org/fhir/StructureDefinition/patient-clinicalTrial#reason");
      if (extensions == null || extensions.size() <= 0)
      {
         return null;
      }
      else if (extensions.size() == 1)
      {
         return (org.hl7.fhir.dstu3.model.CodeableConcept) extensions.get(0)
               .getValue();
      }
      else
      {
         throw new RuntimeException(
               "More than one extension exists for reason");
      }
   }

   public qicorepatientClinicalTrialAdapter setReason(CodeableConcept param)
   {
      rootObjectExtension
            .addExtension()
            .setUrl("http://hl7.org/fhir/StructureDefinition/patient-clinicalTrial#reason")
            .setValue(param);
      return this;
   }

   public Period getPeriod()
   {
      List<org.hl7.fhir.dstu3.model.Extension> extensions = rootObjectExtension
            .getExtensionsByUrl("http://hl7.org/fhir/StructureDefinition/patient-clinicalTrial#period");
      if (extensions == null || extensions.size() <= 0)
      {
         return null;
      }
      else if (extensions.size() == 1)
      {
         return (org.hl7.fhir.dstu3.model.Period) extensions.get(0)
               .getValue();
      }
      else
      {
         throw new RuntimeException(
               "More than one extension exists for period");
      }
   }

   public qicorepatientClinicalTrialAdapter setPeriod(Period param)
   {
      rootObjectExtension
            .addExtension()
            .setUrl("http://hl7.org/fhir/StructureDefinition/patient-clinicalTrial#period")
            .setValue(param);
      return this;
   }
}