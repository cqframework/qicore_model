package org.cqf.qicore.dstu3;

import org.hl7.fhir.dstu3.model.Encounter;
import org.hl7.fhir.dstu3.model.*;

import java.util.List;

import org.hl7.fhir.dstu3.model.Coding;
import org.hl7.fhir.dstu3.model.Reference;
import org.hl7.fhir.dstu3.model.Identifier;
import org.hl7.fhir.dstu3.model.CodeableConcept;
import org.hl7.fhir.dstu3.model.Resource;
import org.hl7.fhir.dstu3.model.CodeType;

import java.lang.String;

import org.hl7.fhir.dstu3.model.Duration;
import org.hl7.fhir.dstu3.model.Appointment;
import org.hl7.fhir.dstu3.model.UriType;
import org.hl7.fhir.dstu3.model.Period;
import org.hl7.fhir.dstu3.model.Organization;
import org.hl7.fhir.dstu3.model.Patient;
import org.hl7.fhir.dstu3.model.IdType;
import org.hl7.fhir.dstu3.model.Enumeration;

public interface Iqicoreencounter
{

   public Encounter getAdaptee();

   public void setAdaptee(Encounter param);

   public Coding getClass_();

   public Iqicoreencounter setClass_(Coding param);

   public boolean hasClass_();

   public boolean hasIncomingReferral();

   public List<Reference> getIncomingReferral();

   public boolean hasDiagnosis();

   public boolean hasEpisodeOfCare();

   public List<Reference> getEpisodeOfCare();

   public List<Identifier> getIdentifier();

   public Iqicoreencounter setIdentifier(List<Identifier> param);

   public boolean hasIdentifier();

   public Iqicoreencounter addIdentifier(Identifier param);

   public Identifier addIdentifier();

   public List<CodeableConcept> getType();

   public Iqicoreencounter setType(List<CodeableConcept> param);

   public boolean hasType();

   public Iqicoreencounter addType(CodeableConcept param);

   public CodeableConcept addType();

   public Encounter.EncounterHospitalizationComponent getHospitalization();

   public qicoreencounterAdapter setHospitalization(
         Encounter.EncounterHospitalizationComponent param);

   public boolean hasHospitalization();

   public List<qicoreencounterRelatedConditionAdapter> getRelatedCondition();

   public Iqicoreencounter setRelatedCondition(
         List<qicoreencounterRelatedConditionAdapter> param);

   public CodeableConcept getReasonCancelled();

   public Iqicoreencounter setReasonCancelled(CodeableConcept param);

   public List<Encounter.EncounterParticipantComponent> getParticipant();

   public qicoreencounterAdapter setParticipant(
         List<Encounter.EncounterParticipantComponent> param);

   public boolean hasParticipant();

   public qicoreencounterAdapter addParticipant(
         Encounter.EncounterParticipantComponent param);

   public Encounter.EncounterParticipantComponent addParticipant();

   public List<Encounter.StatusHistoryComponent> getStatusHistory();

   public qicoreencounterAdapter setStatusHistory(
         List<Encounter.StatusHistoryComponent> param);

   public boolean hasStatusHistory();

   public qicoreencounterAdapter addStatusHistory(
         Encounter.StatusHistoryComponent param);

   public Encounter.StatusHistoryComponent addStatusHistory();

   public List<Resource> getContained();

   public Iqicoreencounter setContained(List<Resource> param);

   public boolean hasContained();

   public Iqicoreencounter addContained(Resource param);

   public boolean hasLanguage();

   public boolean hasLanguageElement();

   public CodeType getLanguageElement();

   public String getLanguage();

   public Iqicoreencounter setLanguageElement(CodeType param);

   public Iqicoreencounter setLanguage(String param);

   public List<CodeableConcept> getReason();

   public Iqicoreencounter setReason(List<CodeableConcept> param);

   public boolean hasReason();

   public Iqicoreencounter addReason(CodeableConcept param);

   public CodeableConcept addReason();

   public Duration getLength();

   public Iqicoreencounter setLength(Duration param);

   public boolean hasLength();

   public List<Encounter.EncounterLocationComponent> getLocation();

   public qicoreencounterAdapter setLocation(
         List<Encounter.EncounterLocationComponent> param);

   public boolean hasLocation();

   public qicoreencounterAdapter addLocation(
         Encounter.EncounterLocationComponent param);

   public Encounter.EncounterLocationComponent addLocation();

   public boolean hasAppointment();

   public Reference getAppointment();

   public Iqicoreencounter setAppointment(Reference param);

   public Appointment getAppointmentTarget();

   public Iqicoreencounter setAppointmentTarget(Appointment param);

   public boolean hasImplicitRules();

   public boolean hasImplicitRulesElement();

   public UriType getImplicitRulesElement();

   public String getImplicitRules();

   public Iqicoreencounter setImplicitRulesElement(UriType param);

   public Iqicoreencounter setImplicitRules(String param);

   public Period getPeriod();

   public Iqicoreencounter setPeriod(Period param);

   public boolean hasPeriod();

   public boolean hasAccount();

   public List<Reference> getAccount();

   public boolean hasPartOf();

   public Reference getPartOf();

   public Iqicoreencounter setPartOf(Reference param);

   public Encounter getPartOfTarget();

   public Iqicoreencounter setPartOfTarget(Encounter param);

   public qicoreencounterAdapter getPartOfAdapterTarget();

   public Iqicoreencounter setPartOfAdapterTarget(qicoreencounterAdapter param);

   public boolean hasServiceProvider();

   public Reference getServiceProvider();

   public Iqicoreencounter setServiceProvider(Reference param);

   public Organization getServiceProviderTarget();

   public Iqicoreencounter setServiceProviderTarget(Organization param);

   public qicoreorganizationAdapter getServiceProviderAdapterTarget();

   public Iqicoreencounter setServiceProviderAdapterTarget(
         qicoreorganizationAdapter param);

   public CodeableConcept getPriority();

   public Iqicoreencounter setPriority(CodeableConcept param);

   public boolean hasPriority();

   public boolean hasPatient();

   public Reference getPatient();

   public Iqicoreencounter setPatient(Reference param);

   public Patient getPatientTarget();

   public Iqicoreencounter setPatientTarget(Patient param);

   public qicorepatientAdapter getPatientAdapterTarget();

   public Iqicoreencounter setPatientAdapterTarget(qicorepatientAdapter param);

   public boolean hasId();

   public boolean hasIdElement();

   public IdType getIdElement();

   public String getId();

   public Iqicoreencounter setIdElement(IdType param);

   public Iqicoreencounter setId(String param);

   public boolean hasStatus();

   public boolean hasStatusElement();

   public Encounter.EncounterStatus getStatus();

   public Enumeration<Encounter.EncounterStatus> getStatusElement();

   public Iqicoreencounter setStatus(Encounter.EncounterStatus param);

   public Iqicoreencounter setStatusElement(
         Enumeration<Encounter.EncounterStatus> param);
}
