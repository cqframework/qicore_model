package org.cqf.qicore.dstu3;

import org.hl7.fhir.dstu3.model.Condition;

import java.util.List;

import org.hl7.fhir.dstu3.model.CodeableConcept;
import org.hl7.fhir.dstu3.model.Reference;
import org.hl7.fhir.dstu3.model.Resource;
import org.hl7.fhir.dstu3.model.Patient;
import org.hl7.fhir.dstu3.model.Practitioner;
import org.hl7.fhir.dstu3.model.Encounter;
import org.hl7.fhir.dstu3.model.Type;
import org.hl7.fhir.dstu3.model.DateTimeType;
import org.hl7.fhir.dstu3.model.Age;
import org.hl7.fhir.dstu3.model.BooleanType;
import org.hl7.fhir.dstu3.model.Period;
import org.hl7.fhir.dstu3.model.Range;
import org.hl7.fhir.dstu3.model.StringType;
import org.hl7.fhir.dstu3.model.CodeType;

import java.lang.String;

import org.hl7.fhir.dstu3.model.UriType;
import org.hl7.fhir.dstu3.model.Identifier;
import org.hl7.fhir.dstu3.model.Enumeration;
import org.hl7.fhir.dstu3.model.Annotation;
import org.hl7.fhir.dstu3.model.IdType;
import org.hl7.fhir.dstu3.model.DateType;

import java.util.Date;

public interface Iqicorecondition
{

   public Condition getAdaptee();

   public void setAdaptee(Condition param);

   public List<Condition.ConditionEvidenceComponent> getEvidence();

   public qicoreconditionAdapter setEvidence(
         List<Condition.ConditionEvidenceComponent> param);

   public boolean hasEvidence();

   public qicoreconditionAdapter addEvidence(
         Condition.ConditionEvidenceComponent param);

   public Condition.ConditionEvidenceComponent addEvidence();

   public CodeableConcept getCategory();

   public Iqicorecondition setCategory(CodeableConcept param);

   public boolean hasCategory();

   public Reference getAsserter();

   public Resource getAsserterTarget();

   public boolean hasAsserter();

   public Reference getAsserterPatient();

   public Iqicorecondition setAsserter(Reference param);

   public Patient getAsserterPatientTarget();

   public Iqicorecondition setAsserterTarget(Patient param);

   public qicorepatientAdapter getAsserterPatientAdapterTarget();

   public Iqicorecondition setAsserterAdapterTarget(qicorepatientAdapter param);

   public Reference getAsserterPractitioner();

   public Practitioner getAsserterPractitionerTarget();

   public Iqicorecondition setAsserterTarget(Practitioner param);

   public qicorepractitionerAdapter getAsserterPractitionerAdapterTarget();

   public Iqicorecondition setAsserterAdapterTarget(
         qicorepractitionerAdapter param);

   public boolean hasContext();

   public Reference getContext();

   public Iqicorecondition setContext(Reference param);

   public Encounter getContextTarget();

   public Iqicorecondition setContextTarget(Encounter param);

   public qicoreencounterAdapter getContextAdapterTarget();

   public Iqicorecondition setContextAdapterTarget(qicoreencounterAdapter param);

   public List<Resource> getContained();

   public Iqicorecondition setContained(List<Resource> param);

   public boolean hasContained();

   public Iqicorecondition addContained(Resource param);

   public Type getAbatement();

   public Iqicorecondition setAbatement(Type param);

   public DateTimeType getAbatementDateTimeType();

   public boolean hasAbatementDateTimeType();

   public Age getAbatementAge();

   public boolean hasAbatementAge();

   public BooleanType getAbatementBooleanType();

   public boolean hasAbatementBooleanType();

   public Period getAbatementPeriod();

   public boolean hasAbatementPeriod();

   public Range getAbatementRange();

   public boolean hasAbatementRange();

   public StringType getAbatementStringType();

   public boolean hasAbatementStringType();

   public Condition.ConditionStageComponent getStage();

   public qicoreconditionAdapter setStage(
         Condition.ConditionStageComponent param);

   public boolean hasStage();

   public boolean hasLanguage();

   public boolean hasLanguageElement();

   public CodeType getLanguageElement();

   public String getLanguage();

   public Iqicorecondition setLanguageElement(CodeType param);

   public Iqicorecondition setLanguage(String param);

   public boolean hasImplicitRules();

   public boolean hasImplicitRulesElement();

   public UriType getImplicitRulesElement();

   public String getImplicitRules();

   public Iqicorecondition setImplicitRulesElement(UriType param);

   public Iqicorecondition setImplicitRules(String param);

   public List<CodeableConcept> getBodySite();

   public Iqicorecondition setBodySite(List<CodeableConcept> param);

   public boolean hasBodySite();

   public Iqicorecondition addBodySite(CodeableConcept param);

   public CodeableConcept addBodySite();

   public CodeableConcept getCriticality();

   public Iqicorecondition setCriticality(CodeableConcept param);

   public List<Identifier> getIdentifier();

   public Iqicorecondition setIdentifier(List<Identifier> param);

   public boolean hasIdentifier();

   public Iqicorecondition addIdentifier(Identifier param);

   public Identifier addIdentifier();

   public boolean hasClinicalStatus();

   public boolean hasClinicalStatusElement();

   public Condition.ConditionClinicalStatus getClinicalStatus();

   public Enumeration<Condition.ConditionClinicalStatus> getClinicalStatusElement();

   public Iqicorecondition setClinicalStatus(
         Condition.ConditionClinicalStatus param);

   public Iqicorecondition setClinicalStatusElement(
         Enumeration<Condition.ConditionClinicalStatus> param);

   public CodeableConcept getCode();

   public Iqicorecondition setCode(CodeableConcept param);

   public boolean hasCode();

   public boolean hasSubject();

   public Reference getSubject();

   public Iqicorecondition setSubject(Reference param);

   public Patient getSubjectTarget();

   public Iqicorecondition setSubjectTarget(Patient param);

   public qicorepatientAdapter getSubjectAdapterTarget();

   public Iqicorecondition setSubjectAdapterTarget(qicorepatientAdapter param);

   public List<Annotation> getNote();

   public Iqicorecondition setNote(List<Annotation> param);

   public boolean hasNote();

   public Iqicorecondition addNote(Annotation param);

   public Annotation addNote();

   public boolean hasId();

   public boolean hasIdElement();

   public IdType getIdElement();

   public String getId();

   public Iqicorecondition setIdElement(IdType param);

   public Iqicorecondition setId(String param);

   public CodeableConcept getSeverity();

   public Iqicorecondition setSeverity(CodeableConcept param);

   public boolean hasSeverity();

   public boolean hasDateRecorded();

   public boolean hasDateRecordedElement();

   public DateType getDateRecordedElement();

   public Date getDateRecorded();

   public Iqicorecondition setDateRecordedElement(DateType param);

   public Iqicorecondition setDateRecorded(Date param);

   public boolean hasVerificationStatus();

   public boolean hasVerificationStatusElement();

   public Condition.ConditionVerificationStatus getVerificationStatus();

   public Enumeration<Condition.ConditionVerificationStatus> getVerificationStatusElement();

   public Iqicorecondition setVerificationStatus(
         Condition.ConditionVerificationStatus param);

   public Iqicorecondition setVerificationStatusElement(
         Enumeration<Condition.ConditionVerificationStatus> param);

   public Type getOnset();

   public Iqicorecondition setOnset(Type param);

   public DateTimeType getOnsetDateTimeType();

   public boolean hasOnsetDateTimeType();

   public Age getOnsetAge();

   public boolean hasOnsetAge();

   public Period getOnsetPeriod();

   public boolean hasOnsetPeriod();

   public Range getOnsetRange();

   public boolean hasOnsetRange();

   public StringType getOnsetStringType();

   public boolean hasOnsetStringType();
}