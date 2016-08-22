package org.cqf.qicore.dstu3;

import org.hl7.fhir.dstu3.model.DiagnosticRequest;
import org.hl7.fhir.dstu3.model.*;

import java.util.List;

import org.hl7.fhir.dstu3.model.CodeableConcept;
import org.hl7.fhir.dstu3.model.Reference;
import org.hl7.fhir.dstu3.model.Resource;
import org.hl7.fhir.dstu3.model.Patient;
import org.hl7.fhir.dstu3.model.Group;
import org.hl7.fhir.dstu3.model.Location;
import org.hl7.fhir.dstu3.model.Device;
import org.hl7.fhir.dstu3.model.Annotation;
import org.hl7.fhir.dstu3.model.IdType;

import java.lang.String;

import org.hl7.fhir.dstu3.model.Encounter;
import org.hl7.fhir.dstu3.model.Identifier;
import org.hl7.fhir.dstu3.model.Practitioner;
import org.hl7.fhir.dstu3.model.Organization;
import org.hl7.fhir.dstu3.model.RelatedPerson;
import org.hl7.fhir.dstu3.model.CodeType;
import org.hl7.fhir.dstu3.model.Type;
import org.hl7.fhir.dstu3.model.DateTimeType;
import org.hl7.fhir.dstu3.model.Period;
import org.hl7.fhir.dstu3.model.Timing;
import org.hl7.fhir.dstu3.model.UriType;
import org.hl7.fhir.dstu3.model.Enumeration;

public interface Iqicorediagnosticrequest
{

   public DiagnosticRequest getAdaptee();

   public void setAdaptee(DiagnosticRequest param);

   public CodeableConcept getPerformerType();

   public Iqicorediagnosticrequest setPerformerType(CodeableConcept param);

   public boolean hasPerformerType();

   public Reference getSubject();

   public Resource getSubjectTarget();

   public boolean hasSubject();

   public Reference getSubjectPatient();

   public Iqicorediagnosticrequest setSubject(Reference param);

   public Patient getSubjectPatientTarget();

   public Iqicorediagnosticrequest setSubjectTarget(Patient param);

   public qicorepatientAdapter getSubjectPatientAdapterTarget();

   public Iqicorediagnosticrequest setSubjectAdapterTarget(
         qicorepatientAdapter param);

   public Reference getSubjectGroup();

   public Group getSubjectGroupTarget();

   public Iqicorediagnosticrequest setSubjectTarget(Group param);

   public Reference getSubjectLocation();

   public Location getSubjectLocationTarget();

   public Iqicorediagnosticrequest setSubjectTarget(Location param);

   public qicorelocationAdapter getSubjectLocationAdapterTarget();

   public Iqicorediagnosticrequest setSubjectAdapterTarget(
         qicorelocationAdapter param);

   public Reference getSubjectDevice();

   public Device getSubjectDeviceTarget();

   public Iqicorediagnosticrequest setSubjectTarget(Device param);

   public qicoredeviceAdapter getSubjectDeviceAdapterTarget();

   public Iqicorediagnosticrequest setSubjectAdapterTarget(
         qicoredeviceAdapter param);

   public List<Annotation> getNote();

   public Iqicorediagnosticrequest setNote(List<Annotation> param);

   public boolean hasNote();

   public Iqicorediagnosticrequest addNote(Annotation param);

   public Annotation addNote();

   public CodeableConcept getCode();

   public Iqicorediagnosticrequest setCode(CodeableConcept param);

   public boolean hasCode();

   public boolean hasRelevantHistory();

   public List<Reference> getRelevantHistory();

   public List<CodeableConcept> getReason();

   public Iqicorediagnosticrequest setReason(List<CodeableConcept> param);

   public boolean hasReason();

   public Iqicorediagnosticrequest addReason(CodeableConcept param);

   public CodeableConcept addReason();

   public boolean hasId();

   public boolean hasIdElement();

   public IdType getIdElement();

   public String getId();

   public Iqicorediagnosticrequest setIdElement(IdType param);

   public Iqicorediagnosticrequest setId(String param);

   public boolean hasContext();

   public Reference getContext();

   public Iqicorediagnosticrequest setContext(Reference param);

   public Encounter getContextTarget();

   public Iqicorediagnosticrequest setContextTarget(Encounter param);

   public qicoreencounterAdapter getContextAdapterTarget();

   public Iqicorediagnosticrequest setContextAdapterTarget(
         qicoreencounterAdapter param);

   public List<Identifier> getIdentifier();

   public Iqicorediagnosticrequest setIdentifier(List<Identifier> param);

   public boolean hasIdentifier();

   public Iqicorediagnosticrequest addIdentifier(Identifier param);

   public Identifier addIdentifier();

   public Reference getPerformer();

   public Resource getPerformerTarget();

   public boolean hasPerformer();

   public Reference getPerformerPractitioner();

   public Iqicorediagnosticrequest setPerformer(Reference param);

   public Practitioner getPerformerPractitionerTarget();

   public Iqicorediagnosticrequest setPerformerTarget(Practitioner param);

   public Reference getPerformerOrganization();

   public Organization getPerformerOrganizationTarget();

   public Iqicorediagnosticrequest setPerformerTarget(Organization param);

   public Reference getPerformerPatient();

   public Patient getPerformerPatientTarget();

   public Iqicorediagnosticrequest setPerformerTarget(Patient param);

   public Reference getPerformerDevice();

   public Device getPerformerDeviceTarget();

   public Iqicorediagnosticrequest setPerformerTarget(Device param);

   public Reference getPerformerRelatedPerson();

   public RelatedPerson getPerformerRelatedPersonTarget();

   public Iqicorediagnosticrequest setPerformerTarget(RelatedPerson param);

   public CodeableConcept getStage();

   public Iqicorediagnosticrequest setStage(CodeableConcept param);

   public boolean hasStage();

   public Identifier getRequisition();

   public Iqicorediagnosticrequest setRequisition(Identifier param);

   public boolean hasRequisition();

   public boolean hasLanguage();

   public boolean hasLanguageElement();

   public CodeType getLanguageElement();

   public String getLanguage();

   public Iqicorediagnosticrequest setLanguageElement(CodeType param);

   public Iqicorediagnosticrequest setLanguage(String param);

   public boolean hasRequester();

   public Reference getRequester();

   public Iqicorediagnosticrequest setRequester(Reference param);

   public Practitioner getRequesterTarget();

   public Iqicorediagnosticrequest setRequesterTarget(Practitioner param);

   public qicorepractitionerAdapter getRequesterAdapterTarget();

   public Iqicorediagnosticrequest setRequesterAdapterTarget(
         qicorepractitionerAdapter param);

   public boolean hasReplaces();

   public List<Reference> getReplaces();

   public boolean hasBasedOn();

   public List<Reference> getBasedOn();

   public boolean hasDefinition();

   public List<Reference> getDefinition();

   public Type getOccurrence();

   public Iqicorediagnosticrequest setOccurrence(Type param);

   public DateTimeType getOccurrenceDateTimeType();

   public boolean hasOccurrenceDateTimeType();

   public Period getOccurrencePeriod();

   public boolean hasOccurrencePeriod();

   public Timing getOccurrenceTiming();

   public boolean hasOccurrenceTiming();

   public boolean hasImplicitRules();

   public boolean hasImplicitRulesElement();

   public UriType getImplicitRulesElement();

   public String getImplicitRules();

   public Iqicorediagnosticrequest setImplicitRulesElement(UriType param);

   public Iqicorediagnosticrequest setImplicitRules(String param);

   public boolean hasSupportingInformation();

   public List<Observation> getSupportingInformationObservationTarget();

   public List<Reference> getSupportingInformation();

   public List<Condition> getSupportingInformationConditionTarget();

   public List<DocumentReference> getSupportingInformationDocumentReferenceTarget();

   public List<Resource> getContained();

   public Iqicorediagnosticrequest setContained(List<Resource> param);

   public boolean hasContained();

   public Iqicorediagnosticrequest addContained(Resource param);

   public boolean hasStatus();

   public boolean hasStatusElement();

   public DiagnosticRequest.DiagnosticRequestStatus getStatus();

   public Enumeration<DiagnosticRequest.DiagnosticRequestStatus> getStatusElement();

   public Iqicorediagnosticrequest setStatus(
         DiagnosticRequest.DiagnosticRequestStatus param);

   public Iqicorediagnosticrequest setStatusElement(
         Enumeration<DiagnosticRequest.DiagnosticRequestStatus> param);
}