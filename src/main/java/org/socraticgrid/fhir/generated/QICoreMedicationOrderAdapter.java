package org.socraticgrid.fhir.generated;

import org.socraticgrid.fhir.generated.IQICoreMedicationOrder;
import ca.uhn.fhir.model.dstu2.resource.MedicationOrder;
import java.util.List;
import org.socraticgrid.fhir.generated.QICoreMedicationOrderDosageInstruction;
import ca.uhn.fhir.model.primitive.StringDt;
import ca.uhn.fhir.model.dstu2.composite.NarrativeDt;
import ca.uhn.fhir.model.primitive.DateTimeDt;
import java.util.Date;
import ca.uhn.fhir.model.primitive.CodeDt;
import ca.uhn.fhir.model.dstu2.composite.ContainedDt;
import ca.uhn.fhir.model.dstu2.valueset.MedicationOrderStatusEnum;
import ca.uhn.fhir.model.primitive.BoundCodeDt;
import ca.uhn.fhir.model.dstu2.composite.BoundCodeableConceptDt;
import ca.uhn.fhir.model.dstu2.composite.ResourceReferenceDt;
import ca.uhn.fhir.model.primitive.IdDt;
import ca.uhn.fhir.model.dstu2.composite.IdentifierDt;
import ca.uhn.fhir.model.dstu2.composite.CodeableConceptDt;
import ca.uhn.fhir.model.api.ExtensionDt;
import ca.uhn.fhir.model.dstu2.resource.*;

public class QICoreMedicationOrderAdapter implements IQICoreMedicationOrder
{

   private MedicationOrder adaptedClass = null;

   public QICoreMedicationOrderAdapter()
   {
      this.adaptedClass = new ca.uhn.fhir.model.dstu2.resource.MedicationOrder();
   }

   public QICoreMedicationOrderAdapter(MedicationOrder adaptee)
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

   public List<QICoreMedicationOrderDosageInstruction> getWrappedDosageInstruction() {
		List<org.socraticgrid.fhir.generated.QICoreMedicationOrderDosageInstruction> items = new java.util.ArrayList<>();
		for (ca.uhn.fhir.model.dstu2.resource.MedicationOrder.DosageInstruction type : adaptedClass
				.getDosageInstruction()) {
			items.add(new org.socraticgrid.fhir.generated.QICoreMedicationOrderDosageInstruction(
					type));
		}
		return items;
	}

   public IQICoreMedicationOrder setWrappedDosageInstruction(
			List<QICoreMedicationOrderDosageInstruction> param) {
		List<ca.uhn.fhir.model.dstu2.resource.MedicationOrder.DosageInstruction> items = new java.util.ArrayList<>();
		for (org.socraticgrid.fhir.generated.QICoreMedicationOrderDosageInstruction item : param) {
			items.add(item.getAdaptee());
		}
		adaptedClass.setDosageInstruction(items);
		return this;
	}

   public IQICoreMedicationOrder addWrappedDosageInstruction(
         QICoreMedicationOrderDosageInstruction param)
   {
      if (param != null)
      {
         adaptedClass.addDosageInstruction(param.getAdaptee());
      }
      return this;
   }

   public QICoreMedicationOrderDosageInstruction addWrappedDosageInstruction()
   {
      ca.uhn.fhir.model.dstu2.resource.MedicationOrder.DosageInstruction item = new ca.uhn.fhir.model.dstu2.resource.MedicationOrder.DosageInstruction();
      adaptedClass.addDosageInstruction(item);
      return new org.socraticgrid.fhir.generated.QICoreMedicationOrderDosageInstruction(
            item);
   }

   public QICoreMedicationOrderDosageInstruction getWrappedDosageInstructionFirstRep()
   {
      org.socraticgrid.fhir.generated.QICoreMedicationOrderDosageInstruction wrapperItem = new org.socraticgrid.fhir.generated.QICoreMedicationOrderDosageInstruction();
      ca.uhn.fhir.model.dstu2.resource.MedicationOrder.DosageInstruction item = adaptedClass
            .getDosageInstructionFirstRep();
      if (item != null)
      {
         wrapperItem = new org.socraticgrid.fhir.generated.QICoreMedicationOrderDosageInstruction(
               item);
      }
      return wrapperItem;
   }

   public List<MedicationOrder.DosageInstruction> getDosageInstruction()
   {
      return adaptedClass.getDosageInstruction();
   }

   public IQICoreMedicationOrder setDosageInstruction(
         List<MedicationOrder.DosageInstruction> param)
   {
      adaptedClass.setDosageInstruction(param);
      return this;
   }

   public IQICoreMedicationOrder addDosageInstruction(
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

   public StringDt getNoteElement()
   {
      return adaptedClass.getNoteElement();
   }

   public String getNote()
   {
      return adaptedClass.getNote();
   }

   public IQICoreMedicationOrder setNote(String param)
   {
      adaptedClass.setNote(new ca.uhn.fhir.model.primitive.StringDt(param));
      return this;
   }

   public IQICoreMedicationOrder setNote(StringDt param)
   {
      adaptedClass.setNote(param);
      return this;
   }

   public NarrativeDt getText()
   {
      return adaptedClass.getText();
   }

   public IQICoreMedicationOrder setText(NarrativeDt param)
   {
      adaptedClass.setText(param);
      return this;
   }

   public MedicationOrder.Substitution getSubstitution()
   {
      return adaptedClass.getSubstitution();
   }

   public IQICoreMedicationOrder setSubstitution(
         MedicationOrder.Substitution param)
   {
      adaptedClass.setSubstitution(param);
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

   public IQICoreMedicationOrder setDateWritten(Date param)
   {
      adaptedClass.setDateWritten(new ca.uhn.fhir.model.primitive.DateTimeDt(
            param));
      return this;
   }

   public IQICoreMedicationOrder setDateWritten(DateTimeDt param)
   {
      adaptedClass.setDateWritten(param);
      return this;
   }

   public CodeDt getLanguage()
   {
      return adaptedClass.getLanguage();
   }

   public IQICoreMedicationOrder setLanguage(CodeDt param)
   {
      adaptedClass.setLanguage(param);
      return this;
   }

   public QICoreEncounterAdapter getEncounterResource()
   {
      if (adaptedClass.getEncounter().getResource() instanceof ca.uhn.fhir.model.dstu2.resource.Encounter)
      {
         org.socraticgrid.fhir.generated.QICoreEncounterAdapter profiledType = new org.socraticgrid.fhir.generated.QICoreEncounterAdapter();
         profiledType
               .setAdaptee((ca.uhn.fhir.model.dstu2.resource.Encounter) adaptedClass
                     .getEncounter().getResource());
         return profiledType;
      }
      else
      {
         return null;
      }
   }

   public IQICoreMedicationOrder setEncounterResource(
         QICoreEncounterAdapter param)
   {
      adaptedClass.getEncounter().setResource(param.getAdaptee());
      return this;
   }

   public MedicationOrder.DispenseRequest getDispenseRequest()
   {
      return adaptedClass.getDispenseRequest();
   }

   public IQICoreMedicationOrder setDispenseRequest(
         MedicationOrder.DispenseRequest param)
   {
      adaptedClass.setDispenseRequest(param);
      return this;
   }

   public ContainedDt getContained()
   {
      return adaptedClass.getContained();
   }

   public IQICoreMedicationOrder setContained(ContainedDt param)
   {
      adaptedClass.setContained(param);
      return this;
   }

   public String getStatus()
   {
      return adaptedClass.getStatus();
   }

   public IQICoreMedicationOrder setStatus(String param)
   {
      adaptedClass
            .setStatus(ca.uhn.fhir.model.dstu2.valueset.MedicationOrderStatusEnum
                  .valueOf(param));
      return this;
   }

   public IQICoreMedicationOrder setStatus(MedicationOrderStatusEnum param)
   {
      adaptedClass.setStatus(param);
      return this;
   }

   public BoundCodeDt<MedicationOrderStatusEnum> getStatusElement()
   {
      return adaptedClass.getStatusElement();
   }

   public IQICoreMedicationOrder setStatus(
         BoundCodeDt<MedicationOrderStatusEnum> param)
   {
      adaptedClass.setStatus(param);
      return this;
   }

   public QICorePractitionerAdapter getPrescriberResource()
   {
      if (adaptedClass.getPrescriber().getResource() instanceof ca.uhn.fhir.model.dstu2.resource.Practitioner)
      {
         org.socraticgrid.fhir.generated.QICorePractitionerAdapter profiledType = new org.socraticgrid.fhir.generated.QICorePractitionerAdapter();
         profiledType
               .setAdaptee((ca.uhn.fhir.model.dstu2.resource.Practitioner) adaptedClass
                     .getPrescriber().getResource());
         return profiledType;
      }
      else
      {
         return null;
      }
   }

   public IQICoreMedicationOrder setPrescriberResource(
         QICorePractitionerAdapter param)
   {
      adaptedClass.getPrescriber().setResource(param.getAdaptee());
      return this;
   }

   public QICorePatientAdapter getPatientResource()
   {
      if (adaptedClass.getPatient().getResource() instanceof ca.uhn.fhir.model.dstu2.resource.Patient)
      {
         org.socraticgrid.fhir.generated.QICorePatientAdapter profiledType = new org.socraticgrid.fhir.generated.QICorePatientAdapter();
         profiledType
               .setAdaptee((ca.uhn.fhir.model.dstu2.resource.Patient) adaptedClass
                     .getPatient().getResource());
         return profiledType;
      }
      else
      {
         return null;
      }
   }

   public IQICoreMedicationOrder setPatientResource(QICorePatientAdapter param)
   {
      adaptedClass.getPatient().setResource(param.getAdaptee());
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

   public IQICoreMedicationOrder setReasonCodeableConcept(
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

   public IQICoreMedicationOrder setReasonReference(ResourceReferenceDt param)
   {
      adaptedClass.setReason(param);
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

   public IQICoreMedicationOrder setDateEnded(Date param)
   {
      adaptedClass.setDateEnded(new ca.uhn.fhir.model.primitive.DateTimeDt(
            param));
      return this;
   }

   public IQICoreMedicationOrder setDateEnded(DateTimeDt param)
   {
      adaptedClass.setDateEnded(param);
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

   public IQICoreMedicationOrder setMedicationCodeableConcept(
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

   public IQICoreMedicationOrder setMedicationReference(
         ResourceReferenceDt param)
   {
      adaptedClass.setMedication(param);
      return this;
   }

   public IdDt getId()
   {
      return adaptedClass.getId();
   }

   public IQICoreMedicationOrder setId(IdDt param)
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

   public IQICoreMedicationOrder setPriorPrescriptionResource(
         MedicationOrder param)
   {
      adaptedClass.getPriorPrescription().setResource(param);
      return this;
   }

   public List<IdentifierDt> getIdentifier()
   {
      return adaptedClass.getIdentifier();
   }

   public IQICoreMedicationOrder setIdentifier(List<IdentifierDt> param)
   {
      adaptedClass.setIdentifier(param);
      return this;
   }

   public IQICoreMedicationOrder addIdentifier(IdentifierDt param)
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

   public IQICoreMedicationOrder setReasonEnded(CodeableConceptDt param)
   {
      adaptedClass.setReasonEnded(param);
      return this;
   }
}