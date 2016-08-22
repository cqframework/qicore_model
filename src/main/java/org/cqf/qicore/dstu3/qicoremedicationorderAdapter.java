package org.cqf.qicore.dstu3;

import org.hl7.fhir.dstu3.model.MedicationOrder;

import java.util.List;
import org.hl7.fhir.dstu3.model.Annotation;
import org.hl7.fhir.dstu3.model.CodeType;
import java.lang.String;
import org.hl7.fhir.dstu3.model.Reference;
import org.hl7.fhir.dstu3.model.Encounter;
import org.hl7.fhir.dstu3.model.Resource;
import org.hl7.fhir.dstu3.model.CodeableConcept;
import org.hl7.fhir.dstu3.model.UriType;
import org.hl7.fhir.dstu3.model.Enumeration;
import org.hl7.fhir.dstu3.model.Practitioner;
import org.hl7.fhir.dstu3.model.Patient;
import org.hl7.fhir.dstu3.model.Type;
import org.hl7.fhir.dstu3.model.Medication;
import org.hl7.fhir.dstu3.model.IdType;
import org.hl7.fhir.dstu3.model.Identifier;

public class qicoremedicationorderAdapter implements Iqicoremedicationorder
{

   private MedicationOrder adaptedClass;

   public qicoremedicationorderAdapter()
   {
      this.adaptedClass = new org.hl7.fhir.dstu3.model.MedicationOrder();
   }

   public qicoremedicationorderAdapter(MedicationOrder adaptee)
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

   public List<qicoremedicationorderDosageInstructionAdapter> getWrappedDosageInstruction() {
		List<qicoremedicationorderDosageInstructionAdapter> wrappedItems = new java.util.ArrayList<>();
		List<org.hl7.fhir.dstu3.model.MedicationOrder.MedicationOrderDosageInstructionComponent> items = adaptedClass
				.getDosageInstruction();
		for (org.hl7.fhir.dstu3.model.MedicationOrder.MedicationOrderDosageInstructionComponent item : items) {
			wrappedItems
					.add(new qicoremedicationorderDosageInstructionAdapter(
							item));
		}
		return wrappedItems;
	}

   public Iqicoremedicationorder setWrappedDosageInstruction(
			List<qicoremedicationorderDosageInstructionAdapter> param) {
		List<org.hl7.fhir.dstu3.model.MedicationOrder.MedicationOrderDosageInstructionComponent> items = new java.util.ArrayList<>();
		for (qicoremedicationorderDosageInstructionAdapter item : param) {
			items.add(item.getAdaptee());
		}
		adaptedClass.getDosageInstruction().addAll(items);
		return this;
	}

   public Iqicoremedicationorder addWrappedDosageInstruction(
         qicoremedicationorderDosageInstructionAdapter param)
   {
      if (param != null)
      {
         adaptedClass.addDosageInstruction(param.getAdaptee());
      }
      return this;
   }

   public qicoremedicationorderDosageInstructionAdapter addWrappedDosageInstruction()
   {
      org.hl7.fhir.dstu3.model.MedicationOrder.MedicationOrderDosageInstructionComponent item = new org.hl7.fhir.dstu3.model.MedicationOrder.MedicationOrderDosageInstructionComponent();
      adaptedClass.addDosageInstruction(item);
      return new qicoremedicationorderDosageInstructionAdapter(
            item);
   }

   public List<MedicationOrder.MedicationOrderDosageInstructionComponent> getDosageInstruction()
   {
      try
      {
         return adaptedClass.getDosageInstruction();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting DosageInstruction", e);
      }
   }

   public Iqicoremedicationorder setDosageInstruction(
         List<MedicationOrder.MedicationOrderDosageInstructionComponent> param)
   {
      adaptedClass.setDosageInstruction(param);
      return this;
   }

   public boolean hasDosageInstruction()
   {
      return adaptedClass.hasDosageInstruction();
   }

   public Iqicoremedicationorder addDosageInstruction(
         MedicationOrder.MedicationOrderDosageInstructionComponent param)
   {
      adaptedClass.addDosageInstruction(param);
      return this;
   }

   public MedicationOrder.MedicationOrderDosageInstructionComponent addDosageInstruction()
   {
      return adaptedClass.addDosageInstruction();
   }

   public List<Annotation> getNote()
   {
      try
      {
         return adaptedClass.getNote();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Note", e);
      }
   }

   public Iqicoremedicationorder setNote(List<Annotation> param)
   {
      adaptedClass.setNote(param);
      return this;
   }

   public boolean hasNote()
   {
      return adaptedClass.hasNote();
   }

   public Iqicoremedicationorder addNote(Annotation param)
   {
      adaptedClass.addNote(param);
      return this;
   }

   public Annotation addNote()
   {
      return adaptedClass.addNote();
   }

   public MedicationOrder.MedicationOrderSubstitutionComponent getSubstitution()
   {
      try
      {
         return adaptedClass.getSubstitution();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Substitution", e);
      }
   }

   public qicoremedicationorderAdapter setSubstitution(
         MedicationOrder.MedicationOrderSubstitutionComponent param)
   {
      adaptedClass.setSubstitution(param);
      return this;
   }

   public boolean hasSubstitution()
   {
      return adaptedClass.hasSubstitution();
   }

   public List<MedicationOrder.MedicationOrderEventHistoryComponent> getEventHistory()
   {
      try
      {
         return adaptedClass.getEventHistory();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting EventHistory", e);
      }
   }

   public qicoremedicationorderAdapter setEventHistory(
         List<MedicationOrder.MedicationOrderEventHistoryComponent> param)
   {
      adaptedClass.setEventHistory(param);
      return this;
   }

   public boolean hasEventHistory()
   {
      return adaptedClass.hasEventHistory();
   }

   public qicoremedicationorderAdapter addEventHistory(
         MedicationOrder.MedicationOrderEventHistoryComponent param)
   {
      adaptedClass.addEventHistory(param);
      return this;
   }

   public MedicationOrder.MedicationOrderEventHistoryComponent addEventHistory()
   {
      return adaptedClass.addEventHistory();
   }

   public boolean hasLanguage()
   {
      return adaptedClass.hasLanguage();
   }

   public boolean hasLanguageElement()
   {
      return adaptedClass.hasLanguageElement();
   }

   public CodeType getLanguageElement()
   {
      try
      {
         return adaptedClass.getLanguageElement();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting LanguageElement", e);
      }
   }

   public String getLanguage()
   {
      try
      {
         return adaptedClass.getLanguage();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Language", e);
      }
   }

   public Iqicoremedicationorder setLanguageElement(CodeType param)
   {
      adaptedClass.setLanguageElement(param);
      return this;
   }

   public Iqicoremedicationorder setLanguage(String param)
   {
      adaptedClass.setLanguage(param);
      return this;
   }

   public boolean hasEncounter()
   {
      return adaptedClass.hasEncounter();
   }

   public Reference getEncounter()
   {
      try
      {
         return adaptedClass.getEncounter();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Encounter", e);
      }
   }

   public Iqicoremedicationorder setEncounter(Reference param)
   {
      adaptedClass.setEncounter(param);
      return this;
   }

   public Encounter getEncounterTarget()
   {
      return (org.hl7.fhir.dstu3.model.Encounter) adaptedClass
            .getEncounterTarget();
   }

   public Iqicoremedicationorder setEncounterTarget(Encounter param)
   {
      adaptedClass.setEncounterTarget(param);
      return this;
   }

   public qicoreencounterAdapter getEncounterAdapterTarget()
   {
      if (adaptedClass.getEncounter().getResource() instanceof org.hl7.fhir.dstu3.model.Encounter)
      {
         qicoreencounterAdapter profiledType = new qicoreencounterAdapter();
         profiledType
               .setAdaptee((org.hl7.fhir.dstu3.model.Encounter) adaptedClass
                     .getEncounter().getResource());
         return profiledType;
      }
      else
      {
         return null;
      }
   }

   public Iqicoremedicationorder setEncounterAdapterTarget(
         qicoreencounterAdapter param)
   {
      adaptedClass.setEncounterTarget(param.getAdaptee());
      return this;
   }

   public MedicationOrder.MedicationOrderDispenseRequestComponent getDispenseRequest()
   {
      try
      {
         return adaptedClass.getDispenseRequest();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting DispenseRequest", e);
      }
   }

   public qicoremedicationorderAdapter setDispenseRequest(
         MedicationOrder.MedicationOrderDispenseRequestComponent param)
   {
      adaptedClass.setDispenseRequest(param);
      return this;
   }

   public boolean hasDispenseRequest()
   {
      return adaptedClass.hasDispenseRequest();
   }

   public List<Resource> getContained()
   {
      try
      {
         return adaptedClass.getContained();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Contained", e);
      }
   }

   public Iqicoremedicationorder setContained(List<Resource> param)
   {
      adaptedClass.setContained(param);
      return this;
   }

   public boolean hasContained()
   {
      return adaptedClass.hasContained();
   }

   public Iqicoremedicationorder addContained(Resource param)
   {
      adaptedClass.addContained(param);
      return this;
   }

   public List<CodeableConcept> getReasonCode()
   {
      try
      {
         return adaptedClass.getReasonCode();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting ReasonCode", e);
      }
   }

   public Iqicoremedicationorder setReasonCode(List<CodeableConcept> param)
   {
      adaptedClass.setReasonCode(param);
      return this;
   }

   public boolean hasReasonCode()
   {
      return adaptedClass.hasReasonCode();
   }

   public Iqicoremedicationorder addReasonCode(CodeableConcept param)
   {
      adaptedClass.addReasonCode(param);
      return this;
   }

   public CodeableConcept addReasonCode()
   {
      return adaptedClass.addReasonCode();
   }

   public boolean hasImplicitRules()
   {
      return adaptedClass.hasImplicitRules();
   }

   public boolean hasImplicitRulesElement()
   {
      return adaptedClass.hasImplicitRulesElement();
   }

   public UriType getImplicitRulesElement()
   {
      try
      {
         return adaptedClass.getImplicitRulesElement();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting ImplicitRulesElement", e);
      }
   }

   public String getImplicitRules()
   {
      try
      {
         return adaptedClass.getImplicitRules();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting ImplicitRules", e);
      }
   }

   public Iqicoremedicationorder setImplicitRulesElement(UriType param)
   {
      adaptedClass.setImplicitRulesElement(param);
      return this;
   }

   public Iqicoremedicationorder setImplicitRules(String param)
   {
      adaptedClass.setImplicitRules(param);
      return this;
   }

   public boolean hasStatus()
   {
      return adaptedClass.hasStatus();
   }

   public boolean hasStatusElement()
   {
      return adaptedClass.hasStatusElement();
   }

   public MedicationOrder.MedicationOrderStatus getStatus()
   {
      try
      {
         return adaptedClass.getStatus();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Status", e);
      }
   }

   public Enumeration<MedicationOrder.MedicationOrderStatus> getStatusElement()
   {
      try
      {
         return adaptedClass.getStatusElement();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting StatusElement", e);
      }
   }

   public Iqicoremedicationorder setStatus(
         MedicationOrder.MedicationOrderStatus param)
   {
      adaptedClass.setStatus(param);
      return this;
   }

   public Iqicoremedicationorder setStatusElement(
         Enumeration<MedicationOrder.MedicationOrderStatus> param)
   {
      adaptedClass.setStatusElement(param);
      return this;
   }

   public boolean hasPrescriber()
   {
      return adaptedClass.hasPrescriber();
   }

   public Reference getPrescriber()
   {
      try
      {
         return adaptedClass.getPrescriber();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Prescriber", e);
      }
   }

   public Iqicoremedicationorder setPrescriber(Reference param)
   {
      adaptedClass.setPrescriber(param);
      return this;
   }

   public Practitioner getPrescriberTarget()
   {
      return (org.hl7.fhir.dstu3.model.Practitioner) adaptedClass
            .getPrescriberTarget();
   }

   public Iqicoremedicationorder setPrescriberTarget(Practitioner param)
   {
      adaptedClass.setPrescriberTarget(param);
      return this;
   }

   public qicorepractitionerAdapter getPrescriberAdapterTarget()
   {
      if (adaptedClass.getPrescriber().getResource() instanceof org.hl7.fhir.dstu3.model.Practitioner)
      {
         qicorepractitionerAdapter profiledType = new qicorepractitionerAdapter();
         profiledType
               .setAdaptee((org.hl7.fhir.dstu3.model.Practitioner) adaptedClass
                     .getPrescriber().getResource());
         return profiledType;
      }
      else
      {
         return null;
      }
   }

   public Iqicoremedicationorder setPrescriberAdapterTarget(
         qicorepractitionerAdapter param)
   {
      adaptedClass.setPrescriberTarget(param.getAdaptee());
      return this;
   }

   public boolean hasReasonReference()
   {
      return adaptedClass.hasReasonReference();
   }

   public List<Reference> getReasonReference()
   {
      return adaptedClass.getReasonReference();
   }

   public boolean hasPatient()
   {
      return adaptedClass.hasPatient();
   }

   public Reference getPatient()
   {
      try
      {
         return adaptedClass.getPatient();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Patient", e);
      }
   }

   public Iqicoremedicationorder setPatient(Reference param)
   {
      adaptedClass.setPatient(param);
      return this;
   }

   public Patient getPatientTarget()
   {
      return (org.hl7.fhir.dstu3.model.Patient) adaptedClass
            .getPatientTarget();
   }

   public Iqicoremedicationorder setPatientTarget(Patient param)
   {
      adaptedClass.setPatientTarget(param);
      return this;
   }

   public qicorepatientAdapter getPatientAdapterTarget()
   {
      if (adaptedClass.getPatient().getResource() instanceof org.hl7.fhir.dstu3.model.Patient)
      {
         qicorepatientAdapter profiledType = new qicorepatientAdapter();
         profiledType
               .setAdaptee((org.hl7.fhir.dstu3.model.Patient) adaptedClass
                     .getPatient().getResource());
         return profiledType;
      }
      else
      {
         return null;
      }
   }

   public Iqicoremedicationorder setPatientAdapterTarget(
         qicorepatientAdapter param)
   {
      adaptedClass.setPatientTarget(param.getAdaptee());
      return this;
   }

   public boolean hasCategory()
   {
      return adaptedClass.hasCategory();
   }

   public boolean hasCategoryElement()
   {
      return adaptedClass.hasCategoryElement();
   }

   public MedicationOrder.MedicationOrderCategory getCategory()
   {
      try
      {
         return adaptedClass.getCategory();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Category", e);
      }
   }

   public Enumeration<MedicationOrder.MedicationOrderCategory> getCategoryElement()
   {
      try
      {
         return adaptedClass.getCategoryElement();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting CategoryElement", e);
      }
   }

   public Iqicoremedicationorder setCategory(
         MedicationOrder.MedicationOrderCategory param)
   {
      adaptedClass.setCategory(param);
      return this;
   }

   public Iqicoremedicationorder setCategoryElement(
         Enumeration<MedicationOrder.MedicationOrderCategory> param)
   {
      adaptedClass.setCategoryElement(param);
      return this;
   }

   public Type getMedication()
   {
      try
      {
         return adaptedClass.getMedication();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Medication", e);
      }
   }

   public Iqicoremedicationorder setMedication(Type param)
   {
      adaptedClass.setMedication(param);
      return this;
   }

   public CodeableConcept getMedicationCodeableConcept()
   {
      try
      {
         return adaptedClass.getMedicationCodeableConcept();
      }
      catch (Exception e)
      {
         throw new RuntimeException(
               "Error getting MedicationCodeableConcept", e);
      }
   }

   public boolean hasMedicationCodeableConcept()
   {
      return adaptedClass.hasMedicationCodeableConcept();
   }

   public boolean hasMedication()
   {
      return adaptedClass.hasMedication();
   }

   public Reference getMedicationReference()
   {
      try
      {
         return adaptedClass.getMedicationReference();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting MedicationReference", e);
      }
   }

   public Medication getMedicationTarget()
   {
      return (org.hl7.fhir.dstu3.model.Medication) ((org.hl7.fhir.dstu3.model.Reference) adaptedClass
            .getMedication()).getResource();
   }

   public Iqicoremedicationorder setMedication(Reference param)
   {
      adaptedClass.setMedication(param);
      return this;
   }

   public Iqicoremedicationorder setMedicationTarget(Medication param)
   {
      Reference reference = new Reference(param);
      adaptedClass.setMedication(reference);
      return this;
   }

   public boolean hasId()
   {
      return adaptedClass.hasId();
   }

   public boolean hasIdElement()
   {
      return adaptedClass.hasIdElement();
   }

   public IdType getIdElement()
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

   public Iqicoremedicationorder setIdElement(IdType param)
   {
      adaptedClass.setIdElement(param);
      return this;
   }

   public Iqicoremedicationorder setId(String param)
   {
      adaptedClass.setId(param);
      return this;
   }

   public boolean hasPriorPrescription()
   {
      return adaptedClass.hasPriorPrescription();
   }

   public Reference getPriorPrescription()
   {
      try
      {
         return adaptedClass.getPriorPrescription();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting PriorPrescription", e);
      }
   }

   public Iqicoremedicationorder setPriorPrescription(Reference param)
   {
      adaptedClass.setPriorPrescription(param);
      return this;
   }

   public MedicationOrder getPriorPrescriptionTarget()
   {
      return (org.hl7.fhir.dstu3.model.MedicationOrder) adaptedClass
            .getPriorPrescriptionTarget();
   }

   public Iqicoremedicationorder setPriorPrescriptionTarget(
         MedicationOrder param)
   {
      adaptedClass.setPriorPrescriptionTarget(param);
      return this;
   }

   public List<Identifier> getIdentifier()
   {
      try
      {
         return adaptedClass.getIdentifier();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Identifier", e);
      }
   }

   public Iqicoremedicationorder setIdentifier(List<Identifier> param)
   {
      adaptedClass.setIdentifier(param);
      return this;
   }

   public boolean hasIdentifier()
   {
      return adaptedClass.hasIdentifier();
   }

   public Iqicoremedicationorder addIdentifier(Identifier param)
   {
      adaptedClass.addIdentifier(param);
      return this;
   }

   public Identifier addIdentifier()
   {
      return adaptedClass.addIdentifier();
   }
}