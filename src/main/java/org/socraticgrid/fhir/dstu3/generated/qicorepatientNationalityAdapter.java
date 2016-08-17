package org.socraticgrid.fhir.dstu3.generated;

import org.hl7.fhir.dstu3.model.Extension;
import org.hl7.fhir.dstu3.model.DomainResource;
import org.hl7.fhir.dstu3.model.Period;
import java.util.List;
import org.hl7.fhir.dstu3.model.CodeableConcept;
import org.hl7.fhir.dstu3.model.*;

public class qicorepatientNationalityAdapter
{

   public static final String uri = "http://hl7.org/fhir/StructureDefinition/patient-nationality";
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

   public Period getPeriod()
   {
      List<org.hl7.fhir.dstu3.model.Extension> extensions = rootObjectExtension
            .getExtensionsByUrl("http://hl7.org/fhir/StructureDefinition/patient-nationality#period");
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

   public qicorepatientNationalityAdapter setPeriod(Period param)
   {
      rootObjectExtension
            .addExtension()
            .setUrl("http://hl7.org/fhir/StructureDefinition/patient-nationality#period")
            .setValue(param);
      return this;
   }

   public CodeableConcept getCode()
   {
      List<org.hl7.fhir.dstu3.model.Extension> extensions = rootObjectExtension
            .getExtensionsByUrl("http://hl7.org/fhir/StructureDefinition/patient-nationality#code");
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
               "More than one extension exists for code");
      }
   }

   public qicorepatientNationalityAdapter setCode(CodeableConcept param)
   {
      rootObjectExtension
            .addExtension()
            .setUrl("http://hl7.org/fhir/StructureDefinition/patient-nationality#code")
            .setValue(param);
      return this;
   }
}