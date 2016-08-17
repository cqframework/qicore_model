package org.socraticgrid.fhir.dstu3.generated;

import org.hl7.fhir.dstu3.model.Extension;
import org.hl7.fhir.dstu3.model.DomainResource;
import org.hl7.fhir.dstu3.model.CodeableConcept;
import java.util.List;
import org.hl7.fhir.dstu3.model.Quantity;
import org.hl7.fhir.dstu3.model.Range;
import org.hl7.fhir.dstu3.model.*;

public class qicoregoalTargetAdapter
{

   public static final String uri = "http://hl7.org/fhir/StructureDefinition/goal-target";
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

   public CodeableConcept getMeasure()
   {
      List<org.hl7.fhir.dstu3.model.Extension> extensions = rootObjectExtension
            .getExtensionsByUrl("http://hl7.org/fhir/StructureDefinition/goal-target#measure");
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
               "More than one extension exists for measure");
      }
   }

   public qicoregoalTargetAdapter setMeasure(CodeableConcept param)
   {
      rootObjectExtension
            .addExtension()
            .setUrl("http://hl7.org/fhir/StructureDefinition/goal-target#measure")
            .setValue(param);
      return this;
   }

   public Quantity getDetailQuantity()
   {
      List<org.hl7.fhir.dstu3.model.Extension> extensions = rootObjectExtension
            .getExtensionsByUrl("http://hl7.org/fhir/StructureDefinition/goal-target#detail");
      if (extensions == null || extensions.size() <= 0)
      {
         return null;
      }
      else if (extensions.size() == 1)
      {
         return (org.hl7.fhir.dstu3.model.Quantity) extensions.get(0)
               .getValue();
      }
      else
      {
         throw new RuntimeException(
               "More than one extension exists for detail");
      }
   }

   public qicoregoalTargetAdapter setDetail(Quantity param)
   {
      rootObjectExtension
            .addExtension()
            .setUrl("http://hl7.org/fhir/StructureDefinition/goal-target#detail")
            .setValue(param);
      return this;
   }

   public Range getDetailRange()
   {
      List<org.hl7.fhir.dstu3.model.Extension> extensions = rootObjectExtension
            .getExtensionsByUrl("http://hl7.org/fhir/StructureDefinition/goal-target#detail");
      if (extensions == null || extensions.size() <= 0)
      {
         return null;
      }
      else if (extensions.size() == 1)
      {
         return (org.hl7.fhir.dstu3.model.Range) extensions.get(0)
               .getValue();
      }
      else
      {
         throw new RuntimeException(
               "More than one extension exists for detail");
      }
   }

   public qicoregoalTargetAdapter setDetail(Range param)
   {
      rootObjectExtension
            .addExtension()
            .setUrl("http://hl7.org/fhir/StructureDefinition/goal-target#detail")
            .setValue(param);
      return this;
   }

   public CodeableConcept getDetailCodeableConcept()
   {
      List<org.hl7.fhir.dstu3.model.Extension> extensions = rootObjectExtension
            .getExtensionsByUrl("http://hl7.org/fhir/StructureDefinition/goal-target#detail");
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
               "More than one extension exists for detail");
      }
   }

   public qicoregoalTargetAdapter setDetail(CodeableConcept param)
   {
      rootObjectExtension
            .addExtension()
            .setUrl("http://hl7.org/fhir/StructureDefinition/goal-target#detail")
            .setValue(param);
      return this;
   }
}