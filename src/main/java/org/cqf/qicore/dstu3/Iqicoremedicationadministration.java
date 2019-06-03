package org.cqf.qicore.dstu3;

import org.hl7.fhir.dstu3.model.MedicationAdministration;
import org.hl7.fhir.dstu3.model.MedicationRequest;

import java.util.List;

import org.hl7.fhir.dstu3.model.CodeType;

import java.lang.String;

import org.hl7.fhir.dstu3.model.Reference;
import org.hl7.fhir.dstu3.model.Resource;
import org.hl7.fhir.dstu3.model.Patient;
import org.hl7.fhir.dstu3.model.CodeableConcept;
import org.hl7.fhir.dstu3.model.Annotation;
import org.hl7.fhir.dstu3.model.Type;
import org.hl7.fhir.dstu3.model.Medication;
import org.hl7.fhir.dstu3.model.DateTimeType;
import org.hl7.fhir.dstu3.model.Period;
import org.hl7.fhir.dstu3.model.BooleanType;

import java.lang.Boolean;

import org.hl7.fhir.dstu3.model.IdType;
import org.hl7.fhir.dstu3.model.Identifier;
import org.hl7.fhir.dstu3.model.Encounter;
import org.hl7.fhir.dstu3.model.Enumeration;
//import org.hl7.fhir.dstu3.model.MedicationOrder;
import org.hl7.fhir.dstu3.model.UriType;

public interface Iqicoremedicationadministration
{

   public MedicationAdministration getAdaptee();

   public void setAdaptee(MedicationAdministration param);

   public MedicationAdministration.MedicationAdministrationDosageComponent getDosage();

   public qicoremedicationadministrationAdapter setDosage(
         MedicationAdministration.MedicationAdministrationDosageComponent param);

   public boolean hasDosage();

   public boolean hasLanguage();

   public boolean hasLanguageElement();

   public CodeType getLanguageElement();

   public String getLanguage();

   public Iqicoremedicationadministration setLanguageElement(CodeType param);

   public Iqicoremedicationadministration setLanguage(String param);

   public List<MedicationAdministration.MedicationAdministrationPerformerComponent> getPerformer();

   public boolean hasPerformer();

   public Iqicoremedicationadministration setPerformer(List<MedicationAdministration.MedicationAdministrationPerformerComponent> param);

   public List<Reference> getEventHistory();
   
   public qicoremedicationadministrationAdapter setEventHistory(
		   List<Reference> param);
   
   public boolean hasEventHistory();

   public qicoremedicationadministrationAdapter addEventHistory(
		   Reference param);
   
   public Reference addEventHistory();
   
   public boolean hasPatient();

   public Reference getPatient();

   public Iqicoremedicationadministration setPatient(Reference param);

   public Patient getPatientTarget();

   public Iqicoremedicationadministration setPatientTarget(Patient param);

   public qicorepatientAdapter getPatientAdapterTarget();

   public Iqicoremedicationadministration setPatientAdapterTarget(
         qicorepatientAdapter param);

   public List<CodeableConcept> getReasonNotGiven();

   public Iqicoremedicationadministration setReasonNotGiven(
         List<CodeableConcept> param);

   public boolean hasReasonNotGiven();

   public Iqicoremedicationadministration addReasonNotGiven(
         CodeableConcept param);

   public CodeableConcept addReasonNotGiven();

   public List<Annotation> getNote();

   public Iqicoremedicationadministration setNote(List<Annotation> param);

   public boolean hasNote();

   public Iqicoremedicationadministration addNote(Annotation param);

   public Annotation addNote();

   public List<CodeableConcept> getReasonCode();

   public Iqicoremedicationadministration setReasonCode(
         List<CodeableConcept> param);

   public boolean hasReasonGiven();

   public Iqicoremedicationadministration addReasonCode(CodeableConcept param);

   public CodeableConcept addReasonCode();

   public Type getMedication();

   public Iqicoremedicationadministration setMedication(Type param);

   public CodeableConcept getMedicationCodeableConcept();

   public boolean hasMedicationCodeableConcept();

   public boolean hasMedication();

   public Reference getMedicationReference();

   public Medication getMedicationTarget();

   public Iqicoremedicationadministration setMedication(Reference param);

   public Iqicoremedicationadministration setMedicationTarget(Medication param);

   public Type getEffective();

   public Iqicoremedicationadministration setEffective(Type param);

   public DateTimeType getEffectiveDateTimeType();

   public boolean hasEffectiveDateTimeType();

   public Period getEffectivePeriod();

   public boolean hasEffectivePeriod();

   public boolean hasNotGiven();

   public boolean hasNotGivenElement();

   public BooleanType getNotGivenElement();

   public Boolean getNotGiven();

   public Iqicoremedicationadministration setNotGivenElement(
         BooleanType param);

   public Iqicoremedicationadministration setNotGiven(Boolean param);

   public boolean hasId();

   public boolean hasIdElement();

   public IdType getIdElement();

   public String getId();

   public Iqicoremedicationadministration setIdElement(IdType param);

   public Iqicoremedicationadministration setId(String param);

   public List<Resource> getContained();

   public Iqicoremedicationadministration setContained(List<Resource> param);

   public boolean hasContained();

   public Iqicoremedicationadministration addContained(Resource param);

   public List<Identifier> getIdentifier();

   public Iqicoremedicationadministration setIdentifier(List<Identifier> param);

   public boolean hasIdentifier();

   public Iqicoremedicationadministration addIdentifier(Identifier param);

   public Identifier addIdentifier();

   public boolean hasDevice();

   public List<Reference> getDevice();

   public boolean hasEncounter();

   public Reference getEncounter();

   public Iqicoremedicationadministration setEncounter(Reference param);

   public Encounter getEncounterTarget();

   public Iqicoremedicationadministration setEncounterTarget(Encounter param);

   public qicoreencounterAdapter getEncounterAdapterTarget();

   public Iqicoremedicationadministration setEncounterAdapterTarget(
         qicoreencounterAdapter param);

   public boolean hasStatus();

   public boolean hasStatusElement();

   public MedicationAdministration.MedicationAdministrationStatus getStatus();

   public Enumeration<MedicationAdministration.MedicationAdministrationStatus> getStatusElement();

   public Iqicoremedicationadministration setStatus(
         MedicationAdministration.MedicationAdministrationStatus param);

   public Iqicoremedicationadministration setStatusElement(
         Enumeration<MedicationAdministration.MedicationAdministrationStatus> param);

   public boolean hasPrescription();

   public Reference getPrescription();

   public Iqicoremedicationadministration setPrescription(Reference param);

   public MedicationRequest getPrescriptionTarget();

   public Iqicoremedicationadministration setPrescriptionTarget(
	         MedicationRequest param);

   public qicoremedicationrequestAdapter getPrescriptionAdapterTarget();

   public Iqicoremedicationadministration setPrescriptionAdapterTarget(
         qicoremedicationrequestAdapter param);

   public boolean hasImplicitRules();

   public boolean hasImplicitRulesElement();

   public UriType getImplicitRulesElement();

   public String getImplicitRules();

   public Iqicoremedicationadministration setImplicitRulesElement(UriType param);

   public Iqicoremedicationadministration setImplicitRules(String param);
}
