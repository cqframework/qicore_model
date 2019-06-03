package org.cqf.qicore.dstu3;

import org.hl7.fhir.dstu3.model.StringType;
import java.lang.String;
import org.hl7.fhir.dstu3.model.BooleanType;
import java.util.List;
import org.hl7.fhir.dstu3.model.Type;
import org.hl7.fhir.dstu3.model.CodeableConcept;
import org.hl7.fhir.dstu3.model.Substance;
import org.hl7.fhir.dstu3.model.Reference;
import org.hl7.fhir.dstu3.model.Medication;
import org.hl7.fhir.dstu3.model.Ratio;

public class qicoremedicationIngredientAdapter
{

   private Medication.MedicationIngredientComponent adaptedClass;

   public qicoremedicationIngredientAdapter()
   {
      this.adaptedClass = new org.hl7.fhir.dstu3.model.Medication.MedicationIngredientComponent();
   }

   public qicoremedicationIngredientAdapter(
         Medication.MedicationIngredientComponent adaptee)
   {
      this.adaptedClass = adaptee;
   }

   public Medication.MedicationIngredientComponent getAdaptee()
   {
      return adaptedClass;
   }

   public void setAdaptee(Medication.MedicationIngredientComponent param)
   {
      this.adaptedClass = param;
   }

   public boolean hasId()
   {
      return adaptedClass.hasId();
   }

   public boolean hasIdElement()
   {
      return adaptedClass.hasIdElement();
   }

   public StringType getIdElement()
   {
      try
      {
         return adaptedClass.getIdElement();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting IdElement", e);
      }
   }

   public String getId()
   {
      try
      {
         return adaptedClass.getId();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Id", e);
      }
   }

   public qicoremedicationIngredientAdapter setIdElement(StringType param)
   {
      adaptedClass.setIdElement(param);
      return this;
   }

   public qicoremedicationIngredientAdapter setId(String param)
   {
      adaptedClass.setId(param);
      return this;
   }

   public BooleanType getIsActiveIngredient()
   {
      List<org.hl7.fhir.dstu3.model.Extension> extensions = adaptedClass
            .getExtensionsByUrl("http://hl7.org/fhir/StructureDefinition/medication-isActiveIngredient");
      if (extensions == null || extensions.size() <= 0)
      {
         return null;
      }
      else if (extensions.size() == 1)
      {
         return (org.hl7.fhir.dstu3.model.BooleanType) extensions.get(0)
               .getValue();
      }
      else
      {
         throw new RuntimeException(
               "More than one extension exists for isActiveIngredient");
      }
   }

   public qicoremedicationIngredientAdapter setIsActiveIngredient(
         BooleanType param)
   {
      adaptedClass
            .addExtension()
            .setUrl("http://hl7.org/fhir/StructureDefinition/medication-isActiveIngredient")
            .setValue(param);
      return this;
   }

   public Type getItem()
   {
      try
      {
         return adaptedClass.getItem();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Item", e);
      }
   }

   public qicoremedicationIngredientAdapter setItem(Type param)
   {
      adaptedClass.setItem(param);
      return this;
   }

   public CodeableConcept getItemCodeableConcept()
   {
      try
      {
         return adaptedClass.getItemCodeableConcept();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting ItemCodeableConcept", e);
      }
   }

   public boolean hasItemCodeableConcept()
   {
      return adaptedClass.hasItemCodeableConcept();
   }

   public boolean hasItem()
   {
      return adaptedClass.hasItem();
   }

   public Reference getItemReference()
   {
      try
      {
         return adaptedClass.getItemReference();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting ItemReference", e);
      }
   }

   public Substance getItemSubstanceTarget()
   {
      return (org.hl7.fhir.dstu3.model.Substance) ((org.hl7.fhir.dstu3.model.Reference) adaptedClass
            .getItem()).getResource();
   }

   public qicoremedicationIngredientAdapter setItem(Reference param)
   {
      adaptedClass.setItem(param);
      return this;
   }

   public qicoremedicationIngredientAdapter setItemTarget(Substance param)
   {
      Reference reference = new Reference(param);
      adaptedClass.setItem(reference);
      return this;
   }

   public Medication getItemMedicationTarget()
   {
      return (org.hl7.fhir.dstu3.model.Medication) ((org.hl7.fhir.dstu3.model.Reference) adaptedClass
            .getItem()).getResource();
   }

   public qicoremedicationIngredientAdapter setItemTarget(Medication param)
   {
      Reference reference = new Reference(param);
      adaptedClass.setItem(reference);
      return this;
   }

   public Ratio getAmount()
   {
      try
      {
         return adaptedClass.getAmount();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Amount", e);
      }
   }

   public qicoremedicationIngredientAdapter setAmount(Ratio param)
   {
      adaptedClass.setAmount(param);
      return this;
   }

   public boolean hasAmount()
   {
      return adaptedClass.hasAmount();
   }
}
