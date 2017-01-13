package org.cqf.qicore.dstu3;

import org.hl7.fhir.dstu3.model.MedicationRequest;

import java.util.List;
import org.hl7.fhir.dstu3.model.Annotation;
import org.hl7.fhir.dstu3.model.CodeType;
import java.lang.String;
import org.hl7.fhir.dstu3.model.Reference;
import org.hl7.fhir.dstu3.model.Encounter;
import org.hl7.fhir.dstu3.model.Resource;
import org.hl7.fhir.dstu3.model.CodeableConcept;
import org.hl7.fhir.dstu3.model.DosageInstruction;
import org.hl7.fhir.dstu3.model.UriType;
import org.hl7.fhir.dstu3.model.MedicationRequest.MedicationRequestDispenseRequestComponent;
import org.hl7.fhir.dstu3.model.MedicationRequest.MedicationRequestStatus;
import org.hl7.fhir.dstu3.model.MedicationRequest.MedicationRequestSubstitutionComponent;
import org.hl7.fhir.dstu3.model.Enumeration;
import org.hl7.fhir.dstu3.model.Practitioner;
import org.hl7.fhir.dstu3.model.Patient;
import org.hl7.fhir.dstu3.model.Type;
import org.hl7.fhir.dstu3.model.Medication;
import org.hl7.fhir.dstu3.model.IdType;
import org.hl7.fhir.dstu3.model.Identifier;

public class qicoremedicationrequestAdapter implements Iqicoremedicationrequest
{

   private MedicationRequest adaptedClass;

   public qicoremedicationrequestAdapter()
   {
      this.adaptedClass = new org.hl7.fhir.dstu3.model.MedicationRequest();
   }

   public qicoremedicationrequestAdapter(MedicationRequest adaptee)
   {
      this.adaptedClass = adaptee;
   }

   public MedicationRequest getAdaptee()
   {
      return adaptedClass;
   }

   public void setAdaptee(MedicationRequest param)
   {
      this.adaptedClass = param;
   }

   public List<qicoremedicationrequestDosageInstructionAdapter> getWrappedDosageInstruction() {
		List<qicoremedicationrequestDosageInstructionAdapter> wrappedItems = new java.util.ArrayList<>();
		List<org.hl7.fhir.dstu3.model.DosageInstruction> items = adaptedClass
				.getDosageInstruction();
		for (org.hl7.fhir.dstu3.model.DosageInstruction item : items) {
			wrappedItems
					.add(new qicoremedicationrequestDosageInstructionAdapter(
							item));
		}
		return wrappedItems;
	}

   public Iqicoremedicationrequest setWrappedDosageInstruction(
			List<qicoremedicationrequestDosageInstructionAdapter> param) {
		List<org.hl7.fhir.dstu3.model.DosageInstruction> items = new java.util.ArrayList<>();
		for (qicoremedicationrequestDosageInstructionAdapter item : param) {
			items.add(item.getAdaptee());
		}
		adaptedClass.getDosageInstruction().addAll(items);
		return this;
	}

   public Iqicoremedicationrequest addWrappedDosageInstruction(
         qicoremedicationrequestDosageInstructionAdapter param)
   {
      if (param != null)
      {
         adaptedClass.addDosageInstruction(param.getAdaptee());
      }
      return this;
   }

   public qicoremedicationrequestDosageInstructionAdapter addWrappedDosageInstruction()
   {
      org.hl7.fhir.dstu3.model.DosageInstruction item = new org.hl7.fhir.dstu3.model.DosageInstruction();
      adaptedClass.addDosageInstruction(item);
      return new qicoremedicationrequestDosageInstructionAdapter(
            item);
   }

   public List<DosageInstruction> getDosageInstruction()
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

   public Iqicoremedicationrequest setDosageInstruction(
         List<DosageInstruction> param)
   {
      adaptedClass.setDosageInstruction(param);
      return this;
   }

   public boolean hasDosageInstruction()
   {
      return adaptedClass.hasDosageInstruction();
   }

   public Iqicoremedicationrequest addDosageInstruction(
         DosageInstruction param)
   {
      adaptedClass.addDosageInstruction(param);
      return this;
   }

   public DosageInstruction addDosageInstruction()
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

   public Iqicoremedicationrequest setNote(List<Annotation> param)
   {
      adaptedClass.setNote(param);
      return this;
   }

   public boolean hasNote()
   {
      return adaptedClass.hasNote();
   }

   public Iqicoremedicationrequest addNote(Annotation param)
   {
      adaptedClass.addNote(param);
      return this;
   }

   public Annotation addNote()
   {
      return adaptedClass.addNote();
   }

   public MedicationRequest.MedicationRequestSubstitutionComponent getSubstitution()
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

   public qicoremedicationrequestAdapter setSubstitution(
		   MedicationRequestSubstitutionComponent param)
   {
      adaptedClass.setSubstitution(param);
      return this;
   }

   public boolean hasSubstitution()
   {
      return adaptedClass.hasSubstitution();
   }

   public List<Reference> getEventHistory()
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

   public qicoremedicationrequestAdapter setEventHistory(
         List<Reference> param)
   {
      adaptedClass.setEventHistory(param);
      return this;
   }

   public boolean hasEventHistory()
   {
      return adaptedClass.hasEventHistory();
   }

   public qicoremedicationrequestAdapter addEventHistory(
         Reference param)
   {
      adaptedClass.addEventHistory(param);
      return this;
   }

   public Reference addEventHistory()
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

   public Iqicoremedicationrequest setLanguageElement(CodeType param)
   {
      adaptedClass.setLanguageElement(param);
      return this;
   }

   public Iqicoremedicationrequest setLanguage(String param)
   {
      adaptedClass.setLanguage(param);
      return this;
   }

   public boolean hasContext()
   {
      return adaptedClass.hasContext();
   }

   public Reference getContext()
   {
      try
      {
         return adaptedClass.getContext();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Encounter", e);
      }
   }

   public Iqicoremedicationrequest setContext(Reference param)
   {
      adaptedClass.setContext(param);
      return this;
   }

   public Resource getContextTarget()
   {
      return (org.hl7.fhir.dstu3.model.Encounter) adaptedClass
            .getContextTarget();
   }

   public Iqicoremedicationrequest setContextTarget(Encounter param)
   {
      adaptedClass.setContextTarget(param);
      return this;
   }

   public qicoreencounterAdapter getEncounterAdapterTarget()
   {
      if (adaptedClass.getContext().getResource() instanceof org.hl7.fhir.dstu3.model.Encounter)
      {
         qicoreencounterAdapter profiledType = new qicoreencounterAdapter();
         profiledType
               .setAdaptee((org.hl7.fhir.dstu3.model.Encounter) adaptedClass
                     .getContext().getResource());
         return profiledType;
      }
      else
      {
         return null;
      }
   }

   public Iqicoremedicationrequest setEncounterAdapterTarget(
         qicoreencounterAdapter param)
   {
      adaptedClass.setContextTarget(param.getAdaptee());
      return this;
   }

   public MedicationRequestDispenseRequestComponent getDispenseRequest()
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

   public qicoremedicationrequestAdapter setDispenseRequest(
		   MedicationRequestDispenseRequestComponent param)
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

   public Iqicoremedicationrequest setContained(List<Resource> param)
   {
      adaptedClass.setContained(param);
      return this;
   }

   public boolean hasContained()
   {
      return adaptedClass.hasContained();
   }

   public Iqicoremedicationrequest addContained(Resource param)
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

   public Iqicoremedicationrequest setReasonCode(List<CodeableConcept> param)
   {
      adaptedClass.setReasonCode(param);
      return this;
   }

   public boolean hasReasonCode()
   {
      return adaptedClass.hasReasonCode();
   }

   public Iqicoremedicationrequest addReasonCode(CodeableConcept param)
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

   public Iqicoremedicationrequest setImplicitRulesElement(UriType param)
   {
      adaptedClass.setImplicitRulesElement(param);
      return this;
   }

   public Iqicoremedicationrequest setImplicitRules(String param)
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

   public MedicationRequestStatus getStatus()
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

   public Enumeration<MedicationRequestStatus> getStatusElement()
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

   public Iqicoremedicationrequest setStatus(
		   MedicationRequestStatus param)
   {
      adaptedClass.setStatus(param);
      return this;
   }

   public Iqicoremedicationrequest setStatusElement(
		   Enumeration<MedicationRequestStatus> param)
   {
      adaptedClass.setStatusElement(param);
      return this;
   }

   public boolean hasRequester()
   {
      return adaptedClass.hasRequester();
   }

   public Reference getRequester()
   {
      try
      {
         return adaptedClass.getRequester();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Prescriber", e);
      }
   }

   public Iqicoremedicationrequest setRequester(Reference param)
   {
      adaptedClass.setRequester(param);
      return this;
   }

   public Practitioner getRequesterTarget()
   {
      return (org.hl7.fhir.dstu3.model.Practitioner) adaptedClass
            .getRequesterTarget();
   }

   public Iqicoremedicationrequest setRequesterTarget(Practitioner param)
   {
      adaptedClass.setRequesterTarget(param);
      return this;
   }

   public qicorepractitionerAdapter getRequesterAdapterTarget()
   {
      if (adaptedClass.getRequester().getResource() instanceof org.hl7.fhir.dstu3.model.Practitioner)
      {
         qicorepractitionerAdapter profiledType = new qicorepractitionerAdapter();
         profiledType
               .setAdaptee((org.hl7.fhir.dstu3.model.Practitioner) adaptedClass
                     .getRequester().getResource());
         return profiledType;
      }
      else
      {
         return null;
      }
   }

   public Iqicoremedicationrequest setRequesterAdapterTarget(
         qicorepractitionerAdapter param)
   {
      adaptedClass.setRequesterTarget(param.getAdaptee());
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

   public Iqicoremedicationrequest setPatient(Reference param)
   {
      adaptedClass.setPatient(param);
      return this;
   }

   public Patient getPatientTarget()
   {
      return (org.hl7.fhir.dstu3.model.Patient) adaptedClass
            .getPatientTarget();
   }

   public Iqicoremedicationrequest setPatientTarget(Patient param)
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

   public Iqicoremedicationrequest setPatientAdapterTarget(
         qicorepatientAdapter param)
   {
      adaptedClass.setPatientTarget(param.getAdaptee());
      return this;
   }

   public boolean hasCategory()
   {
      return adaptedClass.hasCategory();
   }

//   public boolean hasCategoryElement()
//   {
//      return adaptedClass.hasCategoryElement();
//   }

   public CodeableConcept getCategory()
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

//   public Enumeration<MedicationOrder.MedicationOrderCategory> getCategoryElement()
//   {
//      try
//      {
//         return adaptedClass.getCategoryElement();
//      }
//      catch (Exception e)
//      {
//         throw new RuntimeException("Error getting CategoryElement", e);
//      }
//   }

   public Iqicoremedicationrequest setCategory(
		   CodeableConcept param)
   {
      adaptedClass.setCategory(param);
      return this;
   }

//   public Iqicoremedicationrequest setCategoryElement(
//         Enumeration<MedicationOrder.MedicationOrderCategory> param)
//   {
//      adaptedClass.setCategoryElement(param);
//      return this;
//   }

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

   public Iqicoremedicationrequest setMedication(Type param)
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

   public Iqicoremedicationrequest setMedication(Reference param)
   {
      adaptedClass.setMedication(param);
      return this;
   }

   public Iqicoremedicationrequest setMedicationTarget(Medication param)
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

   public Iqicoremedicationrequest setIdElement(IdType param)
   {
      adaptedClass.setIdElement(param);
      return this;
   }

   public Iqicoremedicationrequest setId(String param)
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

   public Iqicoremedicationrequest setPriorPrescription(Reference param)
   {
      adaptedClass.setPriorPrescription(param);
      return this;
   }

   public MedicationRequest getPriorPrescriptionTarget()
   {
      return (org.hl7.fhir.dstu3.model.MedicationRequest) adaptedClass
            .getPriorPrescriptionTarget();
   }

   public Iqicoremedicationrequest setPriorPrescriptionTarget(
		   MedicationRequest param)
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

   public Iqicoremedicationrequest setIdentifier(List<Identifier> param)
   {
      adaptedClass.setIdentifier(param);
      return this;
   }

   public boolean hasIdentifier()
   {
      return adaptedClass.hasIdentifier();
   }

   public Iqicoremedicationrequest addIdentifier(Identifier param)
   {
      adaptedClass.addIdentifier(param);
      return this;
   }

   public Identifier addIdentifier()
   {
      return adaptedClass.addIdentifier();
   }
}