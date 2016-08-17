package org.socraticgrid.fhir.generated;

import ca.uhn.fhir.model.primitive.IdDt;
import ca.uhn.fhir.model.primitive.BooleanDt;
import ca.uhn.fhir.model.dstu2.composite.RatioDt;
import ca.uhn.fhir.model.api.ExtensionDt;
import java.util.List;
import ca.uhn.fhir.model.dstu2.resource.*;

public class QICoreMedicationIngredient
{

   private Medication.ProductIngredient adaptedClass = null;

   public QICoreMedicationIngredient()
   {
      this.adaptedClass = new ca.uhn.fhir.model.dstu2.resource.Medication.ProductIngredient();
   }

   public QICoreMedicationIngredient(Medication.ProductIngredient adaptee)
   {
      this.adaptedClass = adaptee;
   }

   public Medication.ProductIngredient getAdaptee()
   {
      return adaptedClass;
   }

   public void setAdaptee(Medication.ProductIngredient param)
   {
      this.adaptedClass = param;
   }

   public IdDt getId()
   {
      return adaptedClass.getId();
   }

   public QICoreMedicationIngredient setId(IdDt param)
   {
      adaptedClass.setId(param);
      return this;
   }

   public BooleanDt getIsActiveIngredient()
   {
      List<ca.uhn.fhir.model.api.ExtensionDt> extensions = adaptedClass
            .getUndeclaredExtensionsByUrl("http://hl7.org/fhir/StructureDefinition/medication-isActiveIngredient");
      if (extensions == null || extensions.size() <= 0)
      {
         return null;
      }
      else if (extensions.size() == 1)
      {
         return (ca.uhn.fhir.model.primitive.BooleanDt) extensions.get(0)
               .getValue();
      }
      else
      {
         throw new RuntimeException(
               "More than one extension exists for isActiveIngredient");
      }
   }

   public QICoreMedicationIngredient setIsActiveIngredient(BooleanDt param)
   {
      adaptedClass
            .addUndeclaredExtension(
                  false,
                  "http://hl7.org/fhir/StructureDefinition/medication-isActiveIngredient",
                  param);
      return this;
   }

   public RatioDt getAmount()
   {
      return adaptedClass.getAmount();
   }

   public QICoreMedicationIngredient setAmount(RatioDt param)
   {
      adaptedClass.setAmount(param);
      return this;
   }
}