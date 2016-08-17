package org.socraticgrid.fhir.generated;

import org.socraticgrid.fhir.generated.IMedicationDispense;
import ca.uhn.fhir.model.dstu2.resource.MedicationDispense;
import ca.uhn.fhir.model.dstu2.composite.SimpleQuantityDt;
import ca.uhn.fhir.model.primitive.IdDt;
import ca.uhn.fhir.model.dstu2.resource.Practitioner;
import ca.uhn.fhir.model.primitive.StringDt;
import ca.uhn.fhir.model.primitive.DateTimeDt;
import java.util.Date;
import java.util.List;
import ca.uhn.fhir.model.dstu2.composite.ContainedDt;
import ca.uhn.fhir.model.dstu2.valueset.MedicationDispenseStatusEnum;
import ca.uhn.fhir.model.primitive.BoundCodeDt;
import ca.uhn.fhir.model.dstu2.composite.CodeableConceptDt;
import ca.uhn.fhir.model.dstu2.composite.IdentifierDt;
import ca.uhn.fhir.model.dstu2.resource.Location;
import ca.uhn.fhir.model.dstu2.composite.NarrativeDt;
import ca.uhn.fhir.model.primitive.CodeDt;
import ca.uhn.fhir.model.dstu2.resource.Patient;
import ca.uhn.fhir.model.dstu2.composite.BoundCodeableConceptDt;
import ca.uhn.fhir.model.dstu2.composite.ResourceReferenceDt;
import ca.uhn.fhir.model.api.ExtensionDt;
import ca.uhn.fhir.model.dstu2.resource.*;

public class MedicationDispenseAdapter implements IMedicationDispense
{

   private MedicationDispense adaptedClass = null;

   public MedicationDispenseAdapter()
   {
      this.adaptedClass = new ca.uhn.fhir.model.dstu2.resource.MedicationDispense();
   }

   public MedicationDispenseAdapter(MedicationDispense adaptee)
   {
      this.adaptedClass = adaptee;
   }

   public MedicationDispense getAdaptee()
   {
      return adaptedClass;
   }

   public void setAdaptee(MedicationDispense param)
   {
      this.adaptedClass = param;
   }

   public SimpleQuantityDt getQuantity()
   {
      return adaptedClass.getQuantity();
   }

   public IMedicationDispense setQuantity(SimpleQuantityDt param)
   {
      adaptedClass.setQuantity(param);
      return this;
   }

   public IdDt getId()
   {
      return adaptedClass.getId();
   }

   public IMedicationDispense setId(IdDt param)
   {
      adaptedClass.setId(param);
      return this;
   }

   public Practitioner getDispenserResource()
   {
      if (adaptedClass.getDispenser().getResource() instanceof ca.uhn.fhir.model.dstu2.resource.Practitioner)
      {
         return (ca.uhn.fhir.model.dstu2.resource.Practitioner) adaptedClass
               .getDispenser().getResource();
      }
      else
      {
         return null;
      }
   }

   public IMedicationDispense setDispenserResource(Practitioner param)
   {
      adaptedClass.getDispenser().setResource(param);
      return this;
   }

   public StringDt getNoteElement()
   {
      return adaptedClass.getNoteElement();
   }

   public String getNote()
   {
      return adaptedClass.getNote();
   }

   public IMedicationDispense setNote(String param)
   {
      adaptedClass.setNote(new ca.uhn.fhir.model.primitive.StringDt(param));
      return this;
   }

   public IMedicationDispense setNote(StringDt param)
   {
      adaptedClass.setNote(param);
      return this;
   }

   public DateTimeDt getWhenPreparedElement()
   {
      return adaptedClass.getWhenPreparedElement();
   }

   public Date getWhenPrepared()
   {
      return adaptedClass.getWhenPrepared();
   }

   public IMedicationDispense setWhenPrepared(Date param)
   {
      adaptedClass
            .setWhenPrepared(new ca.uhn.fhir.model.primitive.DateTimeDt(
                  param));
      return this;
   }

   public IMedicationDispense setWhenPrepared(DateTimeDt param)
   {
      adaptedClass.setWhenPrepared(param);
      return this;
   }

   public MedicationDispense.Substitution getSubstitution()
   {
      return adaptedClass.getSubstitution();
   }

   public IMedicationDispense setSubstitution(
         MedicationDispense.Substitution param)
   {
      adaptedClass.setSubstitution(param);
      return this;
   }

   public List<MedicationDispense.DosageInstruction> getDosageInstruction()
   {
      return adaptedClass.getDosageInstruction();
   }

   public IMedicationDispense setDosageInstruction(
         List<MedicationDispense.DosageInstruction> param)
   {
      adaptedClass.setDosageInstruction(param);
      return this;
   }

   public IMedicationDispense addDosageInstruction(
         MedicationDispense.DosageInstruction param)
   {
      adaptedClass.addDosageInstruction(param);
      return this;
   }

   public MedicationDispense.DosageInstruction addDosageInstruction()
   {
      ca.uhn.fhir.model.dstu2.resource.MedicationDispense.DosageInstruction item = new ca.uhn.fhir.model.dstu2.resource.MedicationDispense.DosageInstruction();
      adaptedClass.addDosageInstruction(item);
      return item;
   }

   public MedicationDispense.DosageInstruction getDosageInstructionFirstRep()
   {
      return adaptedClass.getDosageInstructionFirstRep();
   }

   public ContainedDt getContained()
   {
      return adaptedClass.getContained();
   }

   public IMedicationDispense setContained(ContainedDt param)
   {
      adaptedClass.setContained(param);
      return this;
   }

   public String getStatus()
   {
      return adaptedClass.getStatus();
   }

   public IMedicationDispense setStatus(String param)
   {
      adaptedClass
            .setStatus(ca.uhn.fhir.model.dstu2.valueset.MedicationDispenseStatusEnum
                  .valueOf(param));
      return this;
   }

   public IMedicationDispense setStatus(MedicationDispenseStatusEnum param)
   {
      adaptedClass.setStatus(param);
      return this;
   }

   public BoundCodeDt<MedicationDispenseStatusEnum> getStatusElement()
   {
      return adaptedClass.getStatusElement();
   }

   public IMedicationDispense setStatus(
         BoundCodeDt<MedicationDispenseStatusEnum> param)
   {
      adaptedClass.setStatus(param);
      return this;
   }

   public CodeableConceptDt getType()
   {
      return adaptedClass.getType();
   }

   public IMedicationDispense setType(CodeableConceptDt param)
   {
      adaptedClass.setType(param);
      return this;
   }

   public SimpleQuantityDt getDaysSupply()
   {
      return adaptedClass.getDaysSupply();
   }

   public IMedicationDispense setDaysSupply(SimpleQuantityDt param)
   {
      adaptedClass.setDaysSupply(param);
      return this;
   }

   public DateTimeDt getWhenHandedOverElement()
   {
      return adaptedClass.getWhenHandedOverElement();
   }

   public Date getWhenHandedOver()
   {
      return adaptedClass.getWhenHandedOver();
   }

   public IMedicationDispense setWhenHandedOver(Date param)
   {
      adaptedClass
            .setWhenHandedOver(new ca.uhn.fhir.model.primitive.DateTimeDt(
                  param));
      return this;
   }

   public IMedicationDispense setWhenHandedOver(DateTimeDt param)
   {
      adaptedClass.setWhenHandedOver(param);
      return this;
   }

   public IdentifierDt getIdentifier()
   {
      return adaptedClass.getIdentifier();
   }

   public IMedicationDispense setIdentifier(IdentifierDt param)
   {
      adaptedClass.setIdentifier(param);
      return this;
   }

   public Location getDestinationResource()
   {
      if (adaptedClass.getDestination().getResource() instanceof ca.uhn.fhir.model.dstu2.resource.Location)
      {
         return (ca.uhn.fhir.model.dstu2.resource.Location) adaptedClass
               .getDestination().getResource();
      }
      else
      {
         return null;
      }
   }

   public IMedicationDispense setDestinationResource(Location param)
   {
      adaptedClass.getDestination().setResource(param);
      return this;
   }

   public NarrativeDt getText()
   {
      return adaptedClass.getText();
   }

   public IMedicationDispense setText(NarrativeDt param)
   {
      adaptedClass.setText(param);
      return this;
   }

   public CodeDt getLanguage()
   {
      return adaptedClass.getLanguage();
   }

   public IMedicationDispense setLanguage(CodeDt param)
   {
      adaptedClass.setLanguage(param);
      return this;
   }

   public Patient getPatientResource()
   {
      if (adaptedClass.getPatient().getResource() instanceof ca.uhn.fhir.model.dstu2.resource.Patient)
      {
         return (ca.uhn.fhir.model.dstu2.resource.Patient) adaptedClass
               .getPatient().getResource();
      }
      else
      {
         return null;
      }
   }

   public IMedicationDispense setPatientResource(Patient param)
   {
      adaptedClass.getPatient().setResource(param);
      return this;
   }

   public BoundCodeableConceptDt getMedicationCodeableConcept()
   {
      if (adaptedClass.getMedication() != null
            && adaptedClass.getMedication() instanceof ca.uhn.fhir.model.dstu2.composite.BoundCodeableConceptDt)
      {
         return (ca.uhn.fhir.model.dstu2.composite.BoundCodeableConceptDt) adaptedClass
               .getMedication();
      }
      else
      {
         return null;
      }
   }

   public IMedicationDispense setMedicationCodeableConcept(
         BoundCodeableConceptDt param)
   {
      adaptedClass.setMedication(param);
      return this;
   }

   public ResourceReferenceDt getMedicationReference()
   {
      if (adaptedClass.getMedication() != null
            && adaptedClass.getMedication() instanceof ca.uhn.fhir.model.dstu2.composite.ResourceReferenceDt)
      {
         return (ca.uhn.fhir.model.dstu2.composite.ResourceReferenceDt) adaptedClass
               .getMedication();
      }
      else
      {
         return null;
      }
   }

   public IMedicationDispense setMedicationReference(ResourceReferenceDt param)
   {
      adaptedClass.setMedication(param);
      return this;
   }
}