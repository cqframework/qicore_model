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
import org.hl7.fhir.dstu3.model.Dosage;
import org.hl7.fhir.dstu3.model.UriType;
import org.hl7.fhir.dstu3.model.Enumeration;
import org.hl7.fhir.dstu3.model.Practitioner;
import org.hl7.fhir.dstu3.model.Patient;
import org.hl7.fhir.dstu3.model.Type;
import org.hl7.fhir.dstu3.model.Medication;
import org.hl7.fhir.dstu3.model.IdType;
import org.hl7.fhir.dstu3.model.Identifier;

public interface Iqicoremedicationrequest
{

   public MedicationRequest getAdaptee();

   public void setAdaptee(MedicationRequest param);

   public List<qicoremedicationrequestDosageInstructionAdapter> getWrappedDosage();

   public Iqicoremedicationrequest setWrappedDosage(
         List<qicoremedicationrequestDosageInstructionAdapter> param);

   public Iqicoremedicationrequest addWrappedDosageInstruction(
         qicoremedicationrequestDosageInstructionAdapter param);

   public qicoremedicationrequestDosageInstructionAdapter addWrappedDosageInstruction();

   public List<Dosage> getDosageInstruction();

   public Iqicoremedicationrequest setDosageInstruction(
         List<Dosage> param);

   public boolean hasDosageInstruction();

   public Iqicoremedicationrequest addDosageInstruction(
		   Dosage param);

   public Dosage addDosageInstruction();

   public List<Annotation> getNote();

   public Iqicoremedicationrequest setNote(List<Annotation> param);

   public boolean hasNote();

   public Iqicoremedicationrequest addNote(Annotation param);

   public Annotation addNote();

   public MedicationRequest.MedicationRequestSubstitutionComponent getSubstitution();

   public qicoremedicationrequestAdapter setSubstitution(
         MedicationRequest.MedicationRequestSubstitutionComponent param);

   public boolean hasSubstitution();

   public List<Reference> getEventHistory();

   public qicoremedicationrequestAdapter setEventHistory(
         List<Reference> param);

   public boolean hasEventHistory();

   public qicoremedicationrequestAdapter addEventHistory(
		   Reference param);

   public Reference addEventHistory();

   public boolean hasLanguage();

   public boolean hasLanguageElement();

   public CodeType getLanguageElement();

   public String getLanguage();

   public Iqicoremedicationrequest setLanguageElement(CodeType param);

   public Iqicoremedicationrequest setLanguage(String param);

   public boolean hasContext();

   public Reference getContext();

   public Iqicoremedicationrequest setContext(Reference param);

   public Resource getContextTarget();

   public Iqicoremedicationrequest setContextTarget(Encounter param);

   public qicoreencounterAdapter getEncounterAdapterTarget();

   public Iqicoremedicationrequest setEncounterAdapterTarget(
         qicoreencounterAdapter param);

   public MedicationRequest.MedicationRequestDispenseRequestComponent getDispenseRequest();

   public qicoremedicationrequestAdapter setDispenseRequest(
         MedicationRequest.MedicationRequestDispenseRequestComponent param);

   public boolean hasDispenseRequest();

   public List<Resource> getContained();

   public Iqicoremedicationrequest setContained(List<Resource> param);

   public boolean hasContained();

   public Iqicoremedicationrequest addContained(Resource param);

   public List<CodeableConcept> getReasonCode();

   public Iqicoremedicationrequest setReasonCode(List<CodeableConcept> param);

   public boolean hasReasonCode();

   public Iqicoremedicationrequest addReasonCode(CodeableConcept param);

   public CodeableConcept addReasonCode();

   public boolean hasImplicitRules();

   public boolean hasImplicitRulesElement();

   public UriType getImplicitRulesElement();

   public String getImplicitRules();

   public Iqicoremedicationrequest setImplicitRulesElement(UriType param);

   public Iqicoremedicationrequest setImplicitRules(String param);

   public boolean hasStatus();

   public boolean hasStatusElement();

   public MedicationRequest.MedicationRequestStatus getStatus();

   public Enumeration<MedicationRequest.MedicationRequestStatus> getStatusElement();

   public Iqicoremedicationrequest setStatus(
         MedicationRequest.MedicationRequestStatus param);

   public Iqicoremedicationrequest setStatusElement(
         Enumeration<MedicationRequest.MedicationRequestStatus> param);

   public boolean hasRequester();

   public Reference getRequester();

   public Iqicoremedicationrequest setRequester(Reference param);

   public Practitioner getRequesterTarget();

   public Iqicoremedicationrequest setRequesterTarget(Practitioner param);

   public qicorepractitionerAdapter getRequesterAdapterTarget();

   public Iqicoremedicationrequest setRequesterAdapterTarget(
         qicorepractitionerAdapter param);

   public boolean hasReasonReference();

   public List<Reference> getReasonReference();

   public boolean hasPatient();

   public Reference getPatient();

   public Iqicoremedicationrequest setPatient(Reference param);

   public Patient getPatientTarget();

   public Iqicoremedicationrequest setPatientTarget(Patient param);

   public qicorepatientAdapter getPatientAdapterTarget();

   public Iqicoremedicationrequest setPatientAdapterTarget(
         qicorepatientAdapter param);

   public boolean hasCategory();

   public CodeableConcept getCategory();

   public Iqicoremedicationrequest setCategory(
		   CodeableConcept param);

   public Type getMedication();

   public Iqicoremedicationrequest setMedication(Type param);

   public CodeableConcept getMedicationCodeableConcept();

   public boolean hasMedicationCodeableConcept();

   public boolean hasMedication();

   public Reference getMedicationReference();

   public Medication getMedicationTarget();

   public Iqicoremedicationrequest setMedication(Reference param);

   public Iqicoremedicationrequest setMedicationTarget(Medication param);

   public boolean hasId();

   public boolean hasIdElement();

   public IdType getIdElement();

   public String getId();

   public Iqicoremedicationrequest setIdElement(IdType param);

   public Iqicoremedicationrequest setId(String param);

   public boolean hasPriorPrescription();

   public Reference getPriorPrescription();

   public Iqicoremedicationrequest setPriorPrescription(Reference param);

   public MedicationRequest getPriorPrescriptionTarget();

   public Iqicoremedicationrequest setPriorPrescriptionTarget(
		   MedicationRequest param);

   public List<Identifier> getIdentifier();

   public Iqicoremedicationrequest setIdentifier(List<Identifier> param);

   public boolean hasIdentifier();

   public Iqicoremedicationrequest addIdentifier(Identifier param);

   public Identifier addIdentifier();
}
