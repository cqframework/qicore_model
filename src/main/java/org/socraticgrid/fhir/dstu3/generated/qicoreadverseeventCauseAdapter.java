package org.socraticgrid.fhir.dstu3.generated;

import org.hl7.fhir.dstu3.model.Extension;
import org.hl7.fhir.dstu3.model.DomainResource;
import org.hl7.fhir.dstu3.model.Medication;
import java.util.List;
import org.hl7.fhir.dstu3.model.MedicationAdministration;
import org.hl7.fhir.dstu3.model.Device;
import org.hl7.fhir.dstu3.model.Procedure;
import org.hl7.fhir.dstu3.model.ImagingStudy;
import org.hl7.fhir.dstu3.model.Communication;
import org.hl7.fhir.dstu3.model.CodeableConcept;
import org.hl7.fhir.dstu3.model.*;

public class qicoreadverseeventCauseAdapter
{

   public static final String uri = "http://hl7.org/fhir/qicore/StructureDefinition/adverseevent-cause";
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

   public Medication getItemMedication()
   {
      List<org.hl7.fhir.dstu3.model.Extension> extensions = rootObjectExtension
            .getExtensionsByUrl("http://hl7.org/fhir/qicore/StructureDefinition/adverseevent-cause#item");
      org.hl7.fhir.dstu3.model.Medication returnItem = null;
      if (extensions.size() == 1)
      {
         returnItem = (org.hl7.fhir.dstu3.model.Medication) ((org.hl7.fhir.dstu3.model.Reference) extensions
               .get(0).getValue()).getResource();
      }
      else if (extensions.size() > 1)
      {
         throw new RuntimeException(
               "Object has more than one extension with uri: " + uri);
      }
      return returnItem;
   }

   public qicoreadverseeventCauseAdapter setItem(Medication param)
   {
      if (param != null)
      {
         rootObjectExtension
               .addExtension()
               .setUrl("http://hl7.org/fhir/qicore/StructureDefinition/adverseevent-cause#item")
               .setValue(new Reference(param));
      }
      return this;
   }

   public MedicationAdministration getItemMedicationAdministration()
   {
      List<org.hl7.fhir.dstu3.model.Extension> extensions = rootObjectExtension
            .getExtensionsByUrl("http://hl7.org/fhir/qicore/StructureDefinition/adverseevent-cause#item");
      org.hl7.fhir.dstu3.model.MedicationAdministration returnItem = null;
      if (extensions.size() == 1)
      {
         returnItem = (org.hl7.fhir.dstu3.model.MedicationAdministration) ((org.hl7.fhir.dstu3.model.Reference) extensions
               .get(0).getValue()).getResource();
      }
      else if (extensions.size() > 1)
      {
         throw new RuntimeException(
               "Object has more than one extension with uri: " + uri);
      }
      return returnItem;
   }

   public qicoreadverseeventCauseAdapter setItem(MedicationAdministration param)
   {
      if (param != null)
      {
         rootObjectExtension
               .addExtension()
               .setUrl("http://hl7.org/fhir/qicore/StructureDefinition/adverseevent-cause#item")
               .setValue(new Reference(param));
      }
      return this;
   }

   public Device getItemDevice()
   {
      List<org.hl7.fhir.dstu3.model.Extension> extensions = rootObjectExtension
            .getExtensionsByUrl("http://hl7.org/fhir/qicore/StructureDefinition/adverseevent-cause#item");
      org.hl7.fhir.dstu3.model.Device returnItem = null;
      if (extensions.size() == 1)
      {
         returnItem = (org.hl7.fhir.dstu3.model.Device) ((org.hl7.fhir.dstu3.model.Reference) extensions
               .get(0).getValue()).getResource();
      }
      else if (extensions.size() > 1)
      {
         throw new RuntimeException(
               "Object has more than one extension with uri: " + uri);
      }
      return returnItem;
   }

   public qicoreadverseeventCauseAdapter setItem(Device param)
   {
      if (param != null)
      {
         rootObjectExtension
               .addExtension()
               .setUrl("http://hl7.org/fhir/qicore/StructureDefinition/adverseevent-cause#item")
               .setValue(new Reference(param));
      }
      return this;
   }

   public Procedure getItemProcedure()
   {
      List<org.hl7.fhir.dstu3.model.Extension> extensions = rootObjectExtension
            .getExtensionsByUrl("http://hl7.org/fhir/qicore/StructureDefinition/adverseevent-cause#item");
      org.hl7.fhir.dstu3.model.Procedure returnItem = null;
      if (extensions.size() == 1)
      {
         returnItem = (org.hl7.fhir.dstu3.model.Procedure) ((org.hl7.fhir.dstu3.model.Reference) extensions
               .get(0).getValue()).getResource();
      }
      else if (extensions.size() > 1)
      {
         throw new RuntimeException(
               "Object has more than one extension with uri: " + uri);
      }
      return returnItem;
   }

   public qicoreadverseeventCauseAdapter setItem(Procedure param)
   {
      if (param != null)
      {
         rootObjectExtension
               .addExtension()
               .setUrl("http://hl7.org/fhir/qicore/StructureDefinition/adverseevent-cause#item")
               .setValue(new Reference(param));
      }
      return this;
   }

   public ImagingStudy getItemImagingStudy()
   {
      List<org.hl7.fhir.dstu3.model.Extension> extensions = rootObjectExtension
            .getExtensionsByUrl("http://hl7.org/fhir/qicore/StructureDefinition/adverseevent-cause#item");
      org.hl7.fhir.dstu3.model.ImagingStudy returnItem = null;
      if (extensions.size() == 1)
      {
         returnItem = (org.hl7.fhir.dstu3.model.ImagingStudy) ((org.hl7.fhir.dstu3.model.Reference) extensions
               .get(0).getValue()).getResource();
      }
      else if (extensions.size() > 1)
      {
         throw new RuntimeException(
               "Object has more than one extension with uri: " + uri);
      }
      return returnItem;
   }

   public qicoreadverseeventCauseAdapter setItem(ImagingStudy param)
   {
      if (param != null)
      {
         rootObjectExtension
               .addExtension()
               .setUrl("http://hl7.org/fhir/qicore/StructureDefinition/adverseevent-cause#item")
               .setValue(new Reference(param));
      }
      return this;
   }

   public Communication getItemCommunication()
   {
      List<org.hl7.fhir.dstu3.model.Extension> extensions = rootObjectExtension
            .getExtensionsByUrl("http://hl7.org/fhir/qicore/StructureDefinition/adverseevent-cause#item");
      org.hl7.fhir.dstu3.model.Communication returnItem = null;
      if (extensions.size() == 1)
      {
         returnItem = (org.hl7.fhir.dstu3.model.Communication) ((org.hl7.fhir.dstu3.model.Reference) extensions
               .get(0).getValue()).getResource();
      }
      else if (extensions.size() > 1)
      {
         throw new RuntimeException(
               "Object has more than one extension with uri: " + uri);
      }
      return returnItem;
   }

   public qicoreadverseeventCauseAdapter setItem(Communication param)
   {
      if (param != null)
      {
         rootObjectExtension
               .addExtension()
               .setUrl("http://hl7.org/fhir/qicore/StructureDefinition/adverseevent-cause#item")
               .setValue(new Reference(param));
      }
      return this;
   }

   public CodeableConcept getCertainty()
   {
      List<org.hl7.fhir.dstu3.model.Extension> extensions = rootObjectExtension
            .getExtensionsByUrl("http://hl7.org/fhir/qicore/StructureDefinition/adverseevent-cause#certainty");
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
               "More than one extension exists for certainty");
      }
   }

   public qicoreadverseeventCauseAdapter setCertainty(CodeableConcept param)
   {
      rootObjectExtension
            .addExtension()
            .setUrl("http://hl7.org/fhir/qicore/StructureDefinition/adverseevent-cause#certainty")
            .setValue(param);
      return this;
   }
}