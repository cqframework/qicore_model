package org.cqf.qicore.dstu3;

import org.hl7.fhir.dstu3.model.ProcedureRequest;

import java.util.List;

import org.hl7.fhir.dstu3.model.Annotation;
import org.hl7.fhir.dstu3.model.IdType;

import java.lang.String;

import org.hl7.fhir.dstu3.model.CodeableConcept;
import org.hl7.fhir.dstu3.model.UriType;
import org.hl7.fhir.dstu3.model.CodeType;
import org.hl7.fhir.dstu3.model.Enumeration;
import org.hl7.fhir.dstu3.model.Reference;
import org.hl7.fhir.dstu3.model.Resource;
import org.hl7.fhir.dstu3.model.Practitioner;
import org.hl7.fhir.dstu3.model.Patient;
import org.hl7.fhir.dstu3.model.RelatedPerson;
import org.hl7.fhir.dstu3.model.Device;
import org.hl7.fhir.dstu3.model.DecimalType;
import org.hl7.fhir.dstu3.model.Type;
import org.hl7.fhir.dstu3.model.Condition;
import org.hl7.fhir.dstu3.model.Group;
import org.hl7.fhir.dstu3.model.DateTimeType;
import org.hl7.fhir.dstu3.model.Period;
import org.hl7.fhir.dstu3.model.Timing;
import org.hl7.fhir.dstu3.model.Encounter;
import org.hl7.fhir.dstu3.model.Identifier;
import org.hl7.fhir.dstu3.model.BooleanType;
import org.hl7.fhir.dstu3.model.Organization;
import org.hl7.fhir.dstu3.model.BodySite;

public interface Iqicoreprocedurerequest
{

   public ProcedureRequest getAdaptee();

   public void setAdaptee(ProcedureRequest param);

   public List<Annotation> getNotes();

   public Iqicoreprocedurerequest setNotes(List<Annotation> param);

   public boolean hasNotes();

   public Iqicoreprocedurerequest addNotes(Annotation param);

   public Annotation addNotes();

   public boolean hasId();

   public boolean hasIdElement();

   public IdType getIdElement();

   public String getId();

   public Iqicoreprocedurerequest setIdElement(IdType param);

   public Iqicoreprocedurerequest setId(String param);

   public CodeableConcept getReasonRefused();

   public Iqicoreprocedurerequest setReasonRefused(CodeableConcept param);

   public boolean hasImplicitRules();

   public boolean hasImplicitRulesElement();

   public UriType getImplicitRulesElement();

   public String getImplicitRules();

   public Iqicoreprocedurerequest setImplicitRulesElement(UriType param);

   public Iqicoreprocedurerequest setImplicitRules(String param);

   public boolean hasLanguage();

   public boolean hasLanguageElement();

   public CodeType getLanguageElement();

   public String getLanguage();

   public Iqicoreprocedurerequest setLanguageElement(CodeType param);

   public Iqicoreprocedurerequest setLanguage(String param);

   public boolean hasPriority();

   public boolean hasPriorityElement();

   public ProcedureRequest.ProcedureRequestPriority getPriority();

   public Enumeration<ProcedureRequest.ProcedureRequestPriority> getPriorityElement();

   public Iqicoreprocedurerequest setPriority(
         ProcedureRequest.ProcedureRequestPriority param);

   public Iqicoreprocedurerequest setPriorityElement(
         Enumeration<ProcedureRequest.ProcedureRequestPriority> param);

   public ProcedureRequest.ProcedureRequestRequesterComponent getRequester();

   public boolean hasRequester();

   public ProcedureRequest.ProcedureRequestRequesterComponent geRequesterPractitioner();

   public Iqicoreprocedurerequest setOrderer(ProcedureRequest.ProcedureRequestRequesterComponent param);

   public qicorepractitionerAdapter getRequesterPractitionerAdapterTarget();

   public Iqicoreprocedurerequest setRequesterAdapterTarget(
         qicorepractitionerAdapter param);

   public Iqicoreprocedurerequest setRequesterAdapterTarget(
         qicorepatientAdapter param);

   public Reference getRequesterRelatedPerson();

   public RelatedPerson getRequesterRelatedPersonTarget();

   public Iqicoreprocedurerequest setRequesterTarget(RelatedPerson param);

   public qicorerelatedpersonAdapter getRequesterRelatedPersonAdapterTarget();

   public Iqicoreprocedurerequest setRequesterAdapterTarget(
         qicorerelatedpersonAdapter param);

   public Reference getRequesterDevice();

   public Device getRequesterDeviceTarget();

   public Iqicoreprocedurerequest setRequesterTarget(Device param);

   public qicoredeviceAdapter getRequesterDeviceAdapterTarget();

   public Iqicoreprocedurerequest setRequesterAdapterTarget(
         qicoredeviceAdapter param);

   public CodeType getAppropriatenessScoreCodeType();

   public Iqicoreprocedurerequest setAppropriatenessScore(CodeType param);

   public DecimalType getAppropriatenessScoreDecimalType();

   public Iqicoreprocedurerequest setAppropriatenessScore(DecimalType param);

   public List<CodeableConcept> getReasonCode();

   public Iqicoreprocedurerequest setReasonCode(List<CodeableConcept> param);

   public boolean hasReasonCode();

   public List<Reference> getReasonReference();

   public Condition getReasonTarget();

   public Iqicoreprocedurerequest setReason(List<Reference> param);

   public Iqicoreprocedurerequest setReasonTarget(List<Resource> param);

   public boolean hasStatus();

   public boolean hasStatusElement();

   public ProcedureRequest.ProcedureRequestStatus getStatus();

   public Enumeration<ProcedureRequest.ProcedureRequestStatus> getStatusElement();

   public Iqicoreprocedurerequest setStatus(
         ProcedureRequest.ProcedureRequestStatus param);

   public Iqicoreprocedurerequest setStatusElement(
         Enumeration<ProcedureRequest.ProcedureRequestStatus> param);

   public Reference getSubject();

   public Resource getSubjectTarget();

   public boolean hasSubject();

   public Reference getSubjectPatient();

   public Iqicoreprocedurerequest setSubject(Reference param);

   public Patient getSubjectPatientTarget();

   public Iqicoreprocedurerequest setSubjectTarget(Patient param);

   public qicorepatientAdapter getSubjectPatientAdapterTarget();

   public Iqicoreprocedurerequest setSubjectAdapterTarget(
         qicorepatientAdapter param);

   public Reference getSubjectGroup();

   public Group getSubjectGroupTarget();

   public Iqicoreprocedurerequest setSubjectTarget(Group param);

   public Type getOccurrence();

   public Iqicoreprocedurerequest setOccurrence(Type param);

   public DateTimeType getOccurrenceDateTimeType();

   public boolean hasOccurrenceDateTimeType();

   public Period getOccurrencePeriod();

   public boolean hasOccurrencePeriod();

   public Timing getOccurrenceTiming();

   public boolean hasOccurrenceTiming();

   public List<Resource> getContained();

   public Iqicoreprocedurerequest setContained(List<Resource> param);

   public boolean hasContained();

   public Iqicoreprocedurerequest addContained(Resource param);

   public boolean hasContext();

   public Reference getContext();

   public Iqicoreprocedurerequest setContext(Reference param);

   public Encounter getContextTarget();

   public Iqicoreprocedurerequest setEncounterTarget(Encounter param);

   public qicoreencounterAdapter getEncounterAdapterTarget();

   public Iqicoreprocedurerequest setEncounterAdapterTarget(
         qicoreencounterAdapter param);

   public List<Identifier> getIdentifier();

   public Iqicoreprocedurerequest setIdentifier(List<Identifier> param);

   public boolean hasIdentifier();

   public Iqicoreprocedurerequest addIdentifier(Identifier param);

   public Identifier addIdentifier();

   public Type getAsNeeded();

   public Iqicoreprocedurerequest setAsNeeded(Type param);

   public BooleanType getAsNeededBooleanType();

   public boolean hasAsNeededBooleanType();

   public CodeableConcept getAsNeededCodeableConcept();

   public boolean hasAsNeededCodeableConcept();

   public List<CodeableConcept> getBodySite();

   public Iqicoreprocedurerequest setBodySite(List<CodeableConcept> param);

   public boolean hasBodySite();

   public Iqicoreprocedurerequest addBodySite(CodeableConcept param);

   public CodeableConcept addBodySite();

   public Reference getPerformer();

   public Resource getPerformerTarget();

   public boolean hasPerformer();

   public Reference getPerformerPractitioner();

   public Iqicoreprocedurerequest setPerformer(Reference param);

   public Practitioner getPerformerPractitionerTarget();

   public Iqicoreprocedurerequest setPerformerTarget(Practitioner param);

   public qicorepractitionerAdapter getPerformerPractitionerAdapterTarget();

   public Iqicoreprocedurerequest setPerformerAdapterTarget(
         qicorepractitionerAdapter param);

   public Reference getPerformerOrganization();

   public Organization getPerformerOrganizationTarget();

   public Iqicoreprocedurerequest setPerformerTarget(Organization param);

   public qicoreorganizationAdapter getPerformerOrganizationAdapterTarget();

   public Iqicoreprocedurerequest setPerformerAdapterTarget(
         qicoreorganizationAdapter param);

   public Reference getPerformerPatient();

   public Patient getPerformerPatientTarget();

   public Iqicoreprocedurerequest setPerformerTarget(Patient param);

   public qicorepatientAdapter getPerformerPatientAdapterTarget();

   public Iqicoreprocedurerequest setPerformerAdapterTarget(
         qicorepatientAdapter param);

   public Reference getPerformerRelatedPerson();

   public RelatedPerson getPerformerRelatedPersonTarget();

   public Iqicoreprocedurerequest setPerformerTarget(RelatedPerson param);

   public qicorerelatedpersonAdapter getPerformerRelatedPersonAdapterTarget();

   public Iqicoreprocedurerequest setPerformerAdapterTarget(
         qicorerelatedpersonAdapter param);

   public List<BodySite> getApproachBodySite();

   public Iqicoreprocedurerequest setApproachBodySite(List<BodySite> param);

   public CodeableConcept getCode();

   public Iqicoreprocedurerequest setCode(CodeableConcept param);

   public boolean hasCode();
}
