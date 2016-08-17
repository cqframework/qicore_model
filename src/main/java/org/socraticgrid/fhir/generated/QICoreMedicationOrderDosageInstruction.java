package org.socraticgrid.fhir.generated;

import ca.uhn.fhir.model.dstu2.composite.RangeDt;
import ca.uhn.fhir.model.dstu2.composite.SimpleQuantityDt;
import ca.uhn.fhir.model.dstu2.composite.CodeableConceptDt;
import ca.uhn.fhir.model.dstu2.composite.RatioDt;
import ca.uhn.fhir.model.primitive.StringDt;
import ca.uhn.fhir.model.primitive.IdDt;
import ca.uhn.fhir.model.dstu2.composite.TimingDt;
import ca.uhn.fhir.model.dstu2.composite.BoundCodeableConceptDt;
import ca.uhn.fhir.model.dstu2.composite.ResourceReferenceDt;
import ca.uhn.fhir.model.api.ExtensionDt;
import ca.uhn.fhir.model.dstu2.composite.QuantityDt;
import ca.uhn.fhir.model.primitive.BooleanDt;
import java.util.List;
import ca.uhn.fhir.model.dstu2.resource.*;

public class QICoreMedicationOrderDosageInstruction
{

   private MedicationOrder.DosageInstruction adaptedClass = null;

   public QICoreMedicationOrderDosageInstruction()
   {
      this.adaptedClass = new ca.uhn.fhir.model.dstu2.resource.MedicationOrder.DosageInstruction();
   }

   public QICoreMedicationOrderDosageInstruction(
         MedicationOrder.DosageInstruction adaptee)
   {
      this.adaptedClass = adaptee;
   }

   public MedicationOrder.DosageInstruction getAdaptee()
   {
      return adaptedClass;
   }

   public void setAdaptee(MedicationOrder.DosageInstruction param)
   {
      this.adaptedClass = param;
   }

   public RangeDt getDoseRange()
   {
      if (adaptedClass.getDose() != null
            && adaptedClass.getDose() instanceof ca.uhn.fhir.model.dstu2.composite.RangeDt)
      {
         return (ca.uhn.fhir.model.dstu2.composite.RangeDt) adaptedClass
               .getDose();
      }
      else
      {
         return null;
      }
   }

   public QICoreMedicationOrderDosageInstruction setDoseRange(RangeDt param)
   {
      adaptedClass.setDose(param);
      return this;
   }

   public SimpleQuantityDt getDoseQuantity()
   {
      if (adaptedClass.getDose() != null
            && adaptedClass.getDose() instanceof ca.uhn.fhir.model.dstu2.composite.SimpleQuantityDt)
      {
         return (ca.uhn.fhir.model.dstu2.composite.SimpleQuantityDt) adaptedClass
               .getDose();
      }
      else
      {
         return null;
      }
   }

   public QICoreMedicationOrderDosageInstruction setDoseQuantity(
         SimpleQuantityDt param)
   {
      adaptedClass.setDose(param);
      return this;
   }

   public CodeableConceptDt getRoute()
   {
      return adaptedClass.getRoute();
   }

   public QICoreMedicationOrderDosageInstruction setRoute(
         CodeableConceptDt param)
   {
      adaptedClass.setRoute(param);
      return this;
   }

   public RatioDt getMaxDosePerPeriod()
   {
      return adaptedClass.getMaxDosePerPeriod();
   }

   public QICoreMedicationOrderDosageInstruction setMaxDosePerPeriod(
         RatioDt param)
   {
      adaptedClass.setMaxDosePerPeriod(param);
      return this;
   }

   public StringDt getTextElement()
   {
      return adaptedClass.getTextElement();
   }

   public String getText()
   {
      return adaptedClass.getText();
   }

   public QICoreMedicationOrderDosageInstruction setText(String param)
   {
      adaptedClass.setText(new ca.uhn.fhir.model.primitive.StringDt(param));
      return this;
   }

   public QICoreMedicationOrderDosageInstruction setText(StringDt param)
   {
      adaptedClass.setText(param);
      return this;
   }

   public CodeableConceptDt getMethod()
   {
      return adaptedClass.getMethod();
   }

   public QICoreMedicationOrderDosageInstruction setMethod(
         CodeableConceptDt param)
   {
      adaptedClass.setMethod(param);
      return this;
   }

   public IdDt getId()
   {
      return adaptedClass.getId();
   }

   public QICoreMedicationOrderDosageInstruction setId(IdDt param)
   {
      adaptedClass.setId(param);
      return this;
   }

   public CodeableConceptDt getAdditionalInstructions()
   {
      return adaptedClass.getAdditionalInstructions();
   }

   public QICoreMedicationOrderDosageInstruction setAdditionalInstructions(
         CodeableConceptDt param)
   {
      adaptedClass.setAdditionalInstructions(param);
      return this;
   }

   public TimingDt getTiming()
   {
      return adaptedClass.getTiming();
   }

   public QICoreMedicationOrderDosageInstruction setTiming(TimingDt param)
   {
      adaptedClass.setTiming(param);
      return this;
   }

   public RatioDt getRateRatio()
   {
      if (adaptedClass.getRate() != null
            && adaptedClass.getRate() instanceof ca.uhn.fhir.model.dstu2.composite.RatioDt)
      {
         return (ca.uhn.fhir.model.dstu2.composite.RatioDt) adaptedClass
               .getRate();
      }
      else
      {
         return null;
      }
   }

   public QICoreMedicationOrderDosageInstruction setRateRatio(RatioDt param)
   {
      adaptedClass.setRate(param);
      return this;
   }

   public RangeDt getRateRange()
   {
      if (adaptedClass.getRate() != null
            && adaptedClass.getRate() instanceof ca.uhn.fhir.model.dstu2.composite.RangeDt)
      {
         return (ca.uhn.fhir.model.dstu2.composite.RangeDt) adaptedClass
               .getRate();
      }
      else
      {
         return null;
      }
   }

   public QICoreMedicationOrderDosageInstruction setRateRange(RangeDt param)
   {
      adaptedClass.setRate(param);
      return this;
   }

   public CodeableConceptDt getDoseType()
   {
      List<ca.uhn.fhir.model.api.ExtensionDt> extensions = adaptedClass
            .getUndeclaredExtensionsByUrl("http://hl7.org/fhir/StructureDefinition/pharmacy-core-doseType");
      if (extensions == null || extensions.size() <= 0)
      {
         return null;
      }
      else if (extensions.size() == 1)
      {
         return (ca.uhn.fhir.model.dstu2.composite.CodeableConceptDt) extensions
               .get(0).getValue();
      }
      else
      {
         throw new RuntimeException(
               "More than one extension exists for doseType");
      }
   }

   public QICoreMedicationOrderDosageInstruction setDoseType(
         CodeableConceptDt param)
   {
      adaptedClass
            .addUndeclaredExtension(
                  false,
                  "http://hl7.org/fhir/StructureDefinition/pharmacy-core-doseType",
                  param);
      return this;
   }

   public RatioDt getMinDosePerPeriod()
   {
      List<ca.uhn.fhir.model.api.ExtensionDt> extensions = adaptedClass
            .getUndeclaredExtensionsByUrl("http://hl7.org/fhir/StructureDefinition/pharmacy-core-minDosePerPeriod");
      if (extensions == null || extensions.size() <= 0)
      {
         return null;
      }
      else if (extensions.size() == 1)
      {
         return (ca.uhn.fhir.model.dstu2.composite.RatioDt) extensions
               .get(0).getValue();
      }
      else
      {
         throw new RuntimeException(
               "More than one extension exists for minDosePerPeriod");
      }
   }

   public QICoreMedicationOrderDosageInstruction setMinDosePerPeriod(
         RatioDt param)
   {
      adaptedClass
            .addUndeclaredExtension(
                  false,
                  "http://hl7.org/fhir/StructureDefinition/pharmacy-core-minDosePerPeriod",
                  param);
      return this;
   }

   public BoundCodeableConceptDt getSiteCodeableConcept()
   {
      if (adaptedClass.getSite() != null
            && adaptedClass.getSite() instanceof ca.uhn.fhir.model.dstu2.composite.BoundCodeableConceptDt)
      {
         return (ca.uhn.fhir.model.dstu2.composite.BoundCodeableConceptDt) adaptedClass
               .getSite();
      }
      else
      {
         return null;
      }
   }

   public QICoreMedicationOrderDosageInstruction setSiteCodeableConcept(
         BoundCodeableConceptDt param)
   {
      adaptedClass.setSite(param);
      return this;
   }

   public ResourceReferenceDt getSiteReference()
   {
      if (adaptedClass.getSite() != null
            && adaptedClass.getSite() instanceof ca.uhn.fhir.model.dstu2.composite.ResourceReferenceDt)
      {
         return (ca.uhn.fhir.model.dstu2.composite.ResourceReferenceDt) adaptedClass
               .getSite();
      }
      else
      {
         return null;
      }
   }

   public QICoreMedicationOrderDosageInstruction setSiteReference(
         ResourceReferenceDt param)
   {
      adaptedClass.setSite(param);
      return this;
   }

   public RatioDt getMaxDeliveryRate()
   {
      List<ca.uhn.fhir.model.api.ExtensionDt> extensions = adaptedClass
            .getUndeclaredExtensionsByUrl("http://hl7.org/fhir/StructureDefinition/pharmacy-core-maxDeliveryRate");
      if (extensions == null || extensions.size() <= 0)
      {
         return null;
      }
      else if (extensions.size() == 1)
      {
         return (ca.uhn.fhir.model.dstu2.composite.RatioDt) extensions
               .get(0).getValue();
      }
      else
      {
         throw new RuntimeException(
               "More than one extension exists for maxDeliveryRate");
      }
   }

   public QICoreMedicationOrderDosageInstruction setMaxDeliveryRate(
         RatioDt param)
   {
      adaptedClass
            .addUndeclaredExtension(
                  false,
                  "http://hl7.org/fhir/StructureDefinition/pharmacy-core-maxDeliveryRate",
                  param);
      return this;
   }

   public RatioDt getRateGoal()
   {
      List<ca.uhn.fhir.model.api.ExtensionDt> extensions = adaptedClass
            .getUndeclaredExtensionsByUrl("http://hl7.org/fhir/StructureDefinition/pharmacy-core-rateGoal");
      if (extensions == null || extensions.size() <= 0)
      {
         return null;
      }
      else if (extensions.size() == 1)
      {
         return (ca.uhn.fhir.model.dstu2.composite.RatioDt) extensions
               .get(0).getValue();
      }
      else
      {
         throw new RuntimeException(
               "More than one extension exists for rateGoal");
      }
   }

   public QICoreMedicationOrderDosageInstruction setRateGoal(RatioDt param)
   {
      adaptedClass
            .addUndeclaredExtension(
                  false,
                  "http://hl7.org/fhir/StructureDefinition/pharmacy-core-rateGoal",
                  param);
      return this;
   }

   public ExtensionDt getInfuseOver()
   {
      List<ca.uhn.fhir.model.api.ExtensionDt> extensions = adaptedClass
            .getUndeclaredExtensionsByUrl("http://hl7.org/fhir/StructureDefinition/pharmacy-core-infuseOver");
      if (extensions == null || extensions.size() <= 0)
      {
         return null;
      }
      else if (extensions.size() == 1)
      {
         return (ca.uhn.fhir.model.api.ExtensionDt) extensions.get(0)
               .getValue();
      }
      else
      {
         throw new RuntimeException(
               "More than one extension exists for infuseOver");
      }
   }

   public QICoreMedicationOrderDosageInstruction setInfuseOver(
         ExtensionDt param)
   {
      adaptedClass
            .addUndeclaredExtension(
                  false,
                  "http://hl7.org/fhir/StructureDefinition/pharmacy-core-infuseOver",
                  param);
      return this;
   }

   public ExtensionDt getRateIncrementInterval()
   {
      List<ca.uhn.fhir.model.api.ExtensionDt> extensions = adaptedClass
            .getUndeclaredExtensionsByUrl("http://hl7.org/fhir/StructureDefinition/pharmacy-core-rateIncrementInterval");
      if (extensions == null || extensions.size() <= 0)
      {
         return null;
      }
      else if (extensions.size() == 1)
      {
         return (ca.uhn.fhir.model.api.ExtensionDt) extensions.get(0)
               .getValue();
      }
      else
      {
         throw new RuntimeException(
               "More than one extension exists for rateIncrementInterval");
      }
   }

   public QICoreMedicationOrderDosageInstruction setRateIncrementInterval(
         ExtensionDt param)
   {
      adaptedClass
            .addUndeclaredExtension(
                  false,
                  "http://hl7.org/fhir/StructureDefinition/pharmacy-core-rateIncrementInterval",
                  param);
      return this;
   }

   public QuantityDt getMaxDeliveryVolume()
   {
      List<ca.uhn.fhir.model.api.ExtensionDt> extensions = adaptedClass
            .getUndeclaredExtensionsByUrl("http://hl7.org/fhir/StructureDefinition/pharmacy-core-maxDeliveryVolume");
      if (extensions == null || extensions.size() <= 0)
      {
         return null;
      }
      else if (extensions.size() == 1)
      {
         return (ca.uhn.fhir.model.dstu2.composite.QuantityDt) extensions
               .get(0).getValue();
      }
      else
      {
         throw new RuntimeException(
               "More than one extension exists for maxDeliveryVolume");
      }
   }

   public QICoreMedicationOrderDosageInstruction setMaxDeliveryVolume(
         QuantityDt param)
   {
      adaptedClass
            .addUndeclaredExtension(
                  false,
                  "http://hl7.org/fhir/StructureDefinition/pharmacy-core-maxDeliveryVolume",
                  param);
      return this;
   }

   public RatioDt getRateIncrement()
   {
      List<ca.uhn.fhir.model.api.ExtensionDt> extensions = adaptedClass
            .getUndeclaredExtensionsByUrl("http://hl7.org/fhir/StructureDefinition/pharmacy-core-rateIncrement");
      if (extensions == null || extensions.size() <= 0)
      {
         return null;
      }
      else if (extensions.size() == 1)
      {
         return (ca.uhn.fhir.model.dstu2.composite.RatioDt) extensions
               .get(0).getValue();
      }
      else
      {
         throw new RuntimeException(
               "More than one extension exists for rateIncrement");
      }
   }

   public QICoreMedicationOrderDosageInstruction setRateIncrement(RatioDt param)
   {
      adaptedClass
            .addUndeclaredExtension(
                  false,
                  "http://hl7.org/fhir/StructureDefinition/pharmacy-core-rateIncrement",
                  param);
      return this;
   }

   public BooleanDt getAsNeededBooleanElement()
   {
      if (adaptedClass.getAsNeeded() != null
            && adaptedClass.getAsNeeded() instanceof ca.uhn.fhir.model.primitive.BooleanDt)
      {
         return (ca.uhn.fhir.model.primitive.BooleanDt) adaptedClass
               .getAsNeeded();
      }
      else
      {
         return null;
      }
   }

   public Boolean getAsNeededBoolean()
   {
      if (adaptedClass.getAsNeeded() != null
            && adaptedClass.getAsNeeded() instanceof ca.uhn.fhir.model.primitive.BooleanDt)
      {
         return ((ca.uhn.fhir.model.primitive.BooleanDt) adaptedClass
               .getAsNeeded()).getValue();
      }
      else
      {
         return null;
      }
   }

   public QICoreMedicationOrderDosageInstruction setAsNeededBoolean(
         BooleanDt param)
   {
      adaptedClass.setAsNeeded(param);
      return this;
   }

   public QICoreMedicationOrderDosageInstruction setAsNeededBoolean(
         Boolean param)
   {
      adaptedClass.setAsNeeded(new ca.uhn.fhir.model.primitive.BooleanDt(
            param));
      return this;
   }

   public BoundCodeableConceptDt getAsNeededCodeableConcept()
   {
      if (adaptedClass.getAsNeeded() != null
            && adaptedClass.getAsNeeded() instanceof ca.uhn.fhir.model.dstu2.composite.BoundCodeableConceptDt)
      {
         return (ca.uhn.fhir.model.dstu2.composite.BoundCodeableConceptDt) adaptedClass
               .getAsNeeded();
      }
      else
      {
         return null;
      }
   }

   public QICoreMedicationOrderDosageInstruction setAsNeededCodeableConcept(
         BoundCodeableConceptDt param)
   {
      adaptedClass.setAsNeeded(param);
      return this;
   }
}