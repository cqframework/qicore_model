package org.socraticgrid.fhir.generated;

import org.socraticgrid.fhir.generated.IMedicationOrder;
import ca.uhn.fhir.model.dstu2.resource.MedicationOrder;
import java.util.List;
import ca.uhn.fhir.model.dstu2.resource.Practitioner;
import ca.uhn.fhir.model.primitive.StringDt;
import ca.uhn.fhir.model.dstu2.resource.Patient;
import ca.uhn.fhir.model.dstu2.composite.BoundCodeableConceptDt;
import ca.uhn.fhir.model.dstu2.composite.ResourceReferenceDt;
import ca.uhn.fhir.model.dstu2.composite.NarrativeDt;
import ca.uhn.fhir.model.primitive.DateTimeDt;
import java.util.Date;
import ca.uhn.fhir.model.primitive.CodeDt;
import ca.uhn.fhir.model.dstu2.resource.Encounter;
import ca.uhn.fhir.model.dstu2.composite.ContainedDt;
import ca.uhn.fhir.model.primitive.IdDt;
import ca.uhn.fhir.model.dstu2.valueset.MedicationOrderStatusEnum;
import ca.uhn.fhir.model.primitive.BoundCodeDt;
import ca.uhn.fhir.model.dstu2.composite.IdentifierDt;
import ca.uhn.fhir.model.dstu2.composite.CodeableConceptDt;
import ca.uhn.fhir.model.api.ExtensionDt;
import ca.uhn.fhir.model.dstu2.resource.*;

public class MedicationOrderAdapter implements IMedicationOrder
{

   private MedicationOrder adaptedClass = null;

   public MedicationOrderAdapter()
   {
      this.adaptedClass = new ca.uhn.fhir.model.dstu2.resource.MedicationOrder();
   }

   public MedicationOrderAdapter(MedicationOrder adaptee)
   {
      this.adaptedClass = adaptee;
   }

   public MedicationOrder getAdaptee()
   {
      return adaptedClass;
   }

   public void setAdaptee(MedicationOrder param)
   {
      this.adaptedClass = param;
   }

   public List<MedicationOrder.DosageInstruction> getDosageInstruction()
   {
      return adaptedClass.getDosageInstruction();
   }

   public IMedicationOrder setDosageInstruction(
         List<MedicationOrder.DosageInstruction> param)
   {
      adaptedClass.setDosageInstruction(param);
      return this;
   }

   public IMedicationOrder addDosageInstruction(
         MedicationOrder.DosageInstruction param)
   {
      adaptedClass.addDosageInstruction(param);
      return this;
   }

   public MedicationOrder.DosageInstruction addDosageInstruction()
   {
      ca.uhn.fhir.model.dstu2.resource.MedicationOrder.DosageInstruction item = new ca.uhn.fhir.model.dstu2.resource.MedicationOrder.DosageInstruction();
      adaptedClass.addDosageInstruction(item);
      return item;
   }

   public MedicationOrder.DosageInstruction getDosageInstructionFirstRep()
   {
      return adaptedClass.getDosageInstructionFirstRep();
   }

   public Practitioner getPrescriberResource()
   {
      if (adaptedClass.getPrescriber().getResource() instanceof ca.uhn.fhir.model.dstu2.resource.Practitioner)
      {
         return (ca.uhn.fhir.model.dstu2.resource.Practitioner) adaptedClass
               .getPrescriber().getResource();
      }
      else
      {
         return null;
      }
   }

   public IMedicationOrder setPrescriberResource(Practitioner param)
   {
      adaptedClass.getPrescriber().setResource(param);
      return this;
   }

   public MedicationOrder.DispenseRequest getDispenseRequest()
   {
      return adaptedClass.getDispenseRequest();
   }

   public IMedicationOrder setDispenseRequest(
         MedicationOrder.DispenseRequest param)
   {
      adaptedClass.setDispenseRequest(param);
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

   public IMedicationOrder setNote(String param)
   {
      adaptedClass.setNote(new ca.uhn.fhir.model.primitive.StringDt(param));
      return this;
   }

   public IMedicationOrder setNote(StringDt param)
   {
      adaptedClass.setNote(param);
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

   public IMedicationOrder setPatientResource(Patient param)
   {
      adaptedClass.getPatient().setResource(param);
      return this;
   }

   public BoundCodeableConceptDt getReasonCodeableConcept()
   {
      if (adaptedClass.getReason() != null
            && adaptedClass.getReason() instanceof ca.uhn.fhir.model.dstu2.composite.BoundCodeableConceptDt)
      {
         return (ca.uhn.fhir.model.dstu2.composite.BoundCodeableConceptDt) adaptedClass
               .getReason();
      }
      else
      {
         return null;
      }
   }

   public IMedicationOrder setReasonCodeableConcept(
         BoundCodeableConceptDt param)
   {
      adaptedClass.setReason(param);
      return this;
   }

   public ResourceReferenceDt getReasonReference()
   {
      if (adaptedClass.getReason() != null
            && adaptedClass.getReason() instanceof ca.uhn.fhir.model.dstu2.composite.ResourceReferenceDt)
      {
         return (ca.uhn.fhir.model.dstu2.composite.ResourceReferenceDt) adaptedClass
               .getReason();
      }
      else
      {
         return null;
      }
   }

   public IMedicationOrder setReasonReference(ResourceReferenceDt param)
   {
      adaptedClass.setReason(param);
      return this;
   }

   public NarrativeDt getText()
   {
      return adaptedClass.getText();
   }

   public IMedicationOrder setText(NarrativeDt param)
   {
      adaptedClass.setText(param);
      return this;
   }

   public DateTimeDt getDateEndedElement()
   {
      return adaptedClass.getDateEndedElement();
   }

   public Date getDateEnded()
   {
      return adaptedClass.getDateEnded();
   }

   public IMedicationOrder setDateEnded(Date param)
   {
      adaptedClass.setDateEnded(new ca.uhn.fhir.model.primitive.DateTimeDt(
            param));
      return this;
   }

   public IMedicationOrder setDateEnded(DateTimeDt param)
   {
      adaptedClass.setDateEnded(param);
      return this;
   }

   public MedicationOrder.Substitution getSubstitution()
   {
      return adaptedClass.getSubstitution();
   }

   public IMedicationOrder setSubstitution(MedicationOrder.Substitution param)
   {
      adaptedClass.setSubstitution(param);
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

   public IMedicationOrder setMedicationCodeableConcept(
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

   public IMedicationOrder setMedicationReference(ResourceReferenceDt param)
   {
      adaptedClass.setMedication(param);
      return this;
   }

   public DateTimeDt getDateWrittenElement()
   {
      return adaptedClass.getDateWrittenElement();
   }

   public Date getDateWritten()
   {
      return adaptedClass.getDateWritten();
   }

   public IMedicationOrder setDateWritten(Date param)
   {
      adaptedClass.setDateWritten(new ca.uhn.fhir.model.primitive.DateTimeDt(
            param));
      return this;
   }

   public IMedicationOrder setDateWritten(DateTimeDt param)
   {
      adaptedClass.setDateWritten(param);
      return this;
   }

   public CodeDt getLanguage()
   {
      return adaptedClass.getLanguage();
   }

   public IMedicationOrder setLanguage(CodeDt param)
   {
      adaptedClass.setLanguage(param);
      return this;
   }

   public Encounter getEncounterResource()
   {
      if (adaptedClass.getEncounter().getResource() instanceof ca.uhn.fhir.model.dstu2.resource.Encounter)
      {
         return (ca.uhn.fhir.model.dstu2.resource.Encounter) adaptedClass
               .getEncounter().getResource();
      }
      else
      {
         return null;
      }
   }

   public IMedicationOrder setEncounterResource(Encounter param)
   {
      adaptedClass.getEncounter().setResource(param);
      return this;
   }

   public ContainedDt getContained()
   {
      return adaptedClass.getContained();
   }

   public IMedicationOrder setContained(ContainedDt param)
   {
      adaptedClass.setContained(param);
      return this;
   }

   public IdDt getId()
   {
      return adaptedClass.getId();
   }

   public IMedicationOrder setId(IdDt param)
   {
      adaptedClass.setId(param);
      return this;
   }

   public MedicationOrder getPriorPrescriptionResource()
   {
      if (adaptedClass.getPriorPrescription().getResource() instanceof ca.uhn.fhir.model.dstu2.resource.MedicationOrder)
      {
         return (ca.uhn.fhir.model.dstu2.resource.MedicationOrder) adaptedClass
               .getPriorPrescription().getResource();
      }
      else
      {
         return null;
      }
   }

   public IMedicationOrder setPriorPrescriptionResource(MedicationOrder param)
   {
      adaptedClass.getPriorPrescription().setResource(param);
      return this;
   }

   public String getStatus()
   {
      return adaptedClass.getStatus();
   }

   public IMedicationOrder setStatus(String param)
   {
      adaptedClass
            .setStatus(ca.uhn.fhir.model.dstu2.valueset.MedicationOrderStatusEnum
                  .valueOf(param));
      return this;
   }

   public IMedicationOrder setStatus(MedicationOrderStatusEnum param)
   {
      adaptedClass.setStatus(param);
      return this;
   }

   public BoundCodeDt<MedicationOrderStatusEnum> getStatusElement()
   {
      return adaptedClass.getStatusElement();
   }

   public IMedicationOrder setStatus(
         BoundCodeDt<MedicationOrderStatusEnum> param)
   {
      adaptedClass.setStatus(param);
      return this;
   }

   public List<IdentifierDt> getIdentifier()
   {
      return adaptedClass.getIdentifier();
   }

   public IMedicationOrder setIdentifier(List<IdentifierDt> param)
   {
      adaptedClass.setIdentifier(param);
      return this;
   }

   public IMedicationOrder addIdentifier(IdentifierDt param)
   {
      adaptedClass.addIdentifier(param);
      return this;
   }

   public IdentifierDt addIdentifier()
   {
      ca.uhn.fhir.model.dstu2.composite.IdentifierDt item = new ca.uhn.fhir.model.dstu2.composite.IdentifierDt();
      adaptedClass.addIdentifier(item);
      return item;
   }

   public IdentifierDt getIdentifierFirstRep()
   {
      return adaptedClass.getIdentifierFirstRep();
   }

   public CodeableConceptDt getReasonEnded()
   {
      return adaptedClass.getReasonEnded();
   }

   public IMedicationOrder setReasonEnded(CodeableConceptDt param)
   {
      adaptedClass.setReasonEnded(param);
      return this;
   }
}