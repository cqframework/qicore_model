package org.socraticgrid.fhir.dstu3.generated;

import org.hl7.fhir.dstu3.model.Extension;
import org.hl7.fhir.dstu3.model.DomainResource;
import org.hl7.fhir.dstu3.model.CodeableConcept;
import java.util.List;
import org.hl7.fhir.dstu3.model.Condition;
import org.hl7.fhir.dstu3.model.*;

public class qicoreencounterRelatedConditionAdapter
{

   public static final String uri = "http://hl7.org/fhir/StructureDefinition/encounter-relatedCondition";
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

   public CodeableConcept getRole()
   {
      List<org.hl7.fhir.dstu3.model.Extension> extensions = rootObjectExtension
            .getExtensionsByUrl("http://hl7.org/fhir/StructureDefinition/encounter-relatedCondition#role");
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
               "More than one extension exists for role");
      }
   }

   public qicoreencounterRelatedConditionAdapter setRole(CodeableConcept param)
   {
      rootObjectExtension
            .addExtension()
            .setUrl("http://hl7.org/fhir/StructureDefinition/encounter-relatedCondition#role")
            .setValue(param);
      return this;
   }

   public Condition getCondition()
   {
      List<org.hl7.fhir.dstu3.model.Extension> extensions = rootObjectExtension
            .getExtensionsByUrl("http://hl7.org/fhir/StructureDefinition/encounter-relatedCondition#condition");
      org.hl7.fhir.dstu3.model.Condition returnItem = null;
      if (extensions.size() == 1)
      {
         returnItem = (org.hl7.fhir.dstu3.model.Condition) ((org.hl7.fhir.dstu3.model.Reference) extensions
               .get(0).getValue()).getResource();
      }
      else if (extensions.size() > 1)
      {
         throw new RuntimeException(
               "Object has more than one extension with uri: " + uri);
      }
      return returnItem;
   }

   public qicoreencounterRelatedConditionAdapter setCondition(Condition param)
   {
      if (param != null)
      {
         rootObjectExtension
               .addExtension()
               .setUrl("http://hl7.org/fhir/StructureDefinition/encounter-relatedCondition#condition")
               .setValue(new Reference(param));
      }
      return this;
   }
}