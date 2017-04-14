package org.cqf.qicore.dstu3;

import org.hl7.fhir.dstu3.model.CommunicationRequest;

import java.util.List;

import org.hl7.fhir.dstu3.model.Resource;
import org.hl7.fhir.dstu3.model.Reference;
import org.hl7.fhir.dstu3.model.Patient;
import org.hl7.fhir.dstu3.model.Practitioner;
import org.hl7.fhir.dstu3.model.RelatedPerson;
import org.hl7.fhir.dstu3.model.CodeType;

import java.lang.String;

import org.hl7.fhir.dstu3.model.CodeableConcept;
import org.hl7.fhir.dstu3.model.UriType;
import org.hl7.fhir.dstu3.model.Encounter;
import org.hl7.fhir.dstu3.model.Enumeration;
import org.hl7.fhir.dstu3.model.Identifier;
import org.hl7.fhir.dstu3.model.Device;
import org.hl7.fhir.dstu3.model.Organization;
import org.hl7.fhir.dstu3.model.Type;
import org.hl7.fhir.dstu3.model.DateTimeType;
import org.hl7.fhir.dstu3.model.Period;
import org.hl7.fhir.dstu3.model.IdType;

public interface Iqicorecommunicationrequest
{

   public CommunicationRequest getAdaptee();

   public void setAdaptee(CommunicationRequest param);

   public List<Resource> getContained();

   public Iqicorecommunicationrequest setContained(List<Resource> param);

   public boolean hasContained();

   public Iqicorecommunicationrequest addContained(Resource param);

   public Reference getRequester();

   public Resource getRequesterTarget();

   public boolean hasRequester();

   public Reference getRequesterPatient();

   public Iqicorecommunicationrequest setRequester(Reference param);

   public Patient getRequesterPatientTarget();

   public Iqicorecommunicationrequest setRequesterTarget(Patient param);

   public qicorepatientAdapter getRequesterPatientAdapterTarget();

   public Iqicorecommunicationrequest setRequesterAdapterTarget(
         qicorepatientAdapter param);

   public Reference getRequesterPractitioner();

   public Practitioner getRequesterPractitionerTarget();

   public Iqicorecommunicationrequest setRequesterTarget(Practitioner param);

   public qicorepractitionerAdapter getRequesterPractitionerAdapterTarget();

   public Iqicorecommunicationrequest setRequesterAdapterTarget(
         qicorepractitionerAdapter param);

   public Reference getRequesterRelatedPerson();

   public RelatedPerson getRequesterRelatedPersonTarget();

   public Iqicorecommunicationrequest setRequesterTarget(RelatedPerson param);

   public qicorerelatedpersonAdapter getRequesterRelatedPersonAdapterTarget();

   public Iqicorecommunicationrequest setRequesterAdapterTarget(
         qicorerelatedpersonAdapter param);

   public boolean hasLanguage();

   public boolean hasLanguageElement();

   public CodeType getLanguageElement();

   public String getLanguage();

   public Iqicorecommunicationrequest setLanguageElement(CodeType param);

   public Iqicorecommunicationrequest setLanguage(String param);

   public CodeableConcept getReasonRejected();

   public Iqicorecommunicationrequest setReasonRejected(CodeableConcept param);

   public List<CodeableConcept> getMedium();

   public Iqicorecommunicationrequest setMedium(List<CodeableConcept> param);

   public boolean hasMedium();

   public Iqicorecommunicationrequest addMedium(CodeableConcept param);

   public CodeableConcept addMedium();

   public boolean hasImplicitRules();

   public boolean hasImplicitRulesElement();

   public UriType getImplicitRulesElement();

   public String getImplicitRules();

   public Iqicorecommunicationrequest setImplicitRulesElement(UriType param);

   public Iqicorecommunicationrequest setImplicitRules(String param);

   public List<CommunicationRequest.CommunicationRequestPayloadComponent> getPayload();

   public qicorecommunicationrequestAdapter setPayload(
         List<CommunicationRequest.CommunicationRequestPayloadComponent> param);

   public boolean hasPayload();

   public qicorecommunicationrequestAdapter addPayload(
         CommunicationRequest.CommunicationRequestPayloadComponent param);

   public CommunicationRequest.CommunicationRequestPayloadComponent addPayload();

   public CodeableConcept getPriority();

   public Iqicorecommunicationrequest setPriority(CodeableConcept param);

   public boolean hasPriority();

   public boolean hasContext();

   public Reference getContext();

   public Iqicorecommunicationrequest setContext(Reference param);

   public Encounter getContextTarget();

   public Iqicorecommunicationrequest setContextTarget(Resource param);

   public qicoreencounterAdapter getContextAdapterTarget();

   public Iqicorecommunicationrequest setContextAdapterTarget(
         qicoreencounterAdapter param);

   public boolean hasStatus();

   public boolean hasStatusElement();

   public CommunicationRequest.CommunicationRequestStatus getStatus();

   public Enumeration<CommunicationRequest.CommunicationRequestStatus> getStatusElement();

   public Iqicorecommunicationrequest setStatus(
         CommunicationRequest.CommunicationRequestStatus param);

   public Iqicorecommunicationrequest setStatusElement(
         Enumeration<CommunicationRequest.CommunicationRequestStatus> param);

   public boolean hasRecipient();

   public List<Practitioner> getRecipientPractitionerTarget();

   public List<Reference> getRecipient();

   public List<Patient> getRecipientPatientTarget();

   public List<Device> getRecipientDeviceTarget();

   public List<RelatedPerson> getRecipientRelatedPersonTarget();

   public List<Organization> getRecipientOrganizationTarget();

   public boolean hasSubject();

   public Reference getSubject();

   public Iqicorecommunicationrequest setSubject(Reference param);

   public Patient getSubjectTarget();

   public Iqicorecommunicationrequest setSubjectTarget(Patient param);

   public List<Identifier> getIdentifier();

   public Iqicorecommunicationrequest setIdentifier(List<Identifier> param);

   public boolean hasIdentifier();

   public Iqicorecommunicationrequest addIdentifier(Identifier param);

   public Identifier addIdentifier();

   public CodeableConcept getCategory();

   public Iqicorecommunicationrequest setCategory(CodeableConcept param);

   public boolean hasCategory();

   public Reference getSender();

   public Resource getSenderTarget();

   public boolean hasSender();

   public Reference getSenderPractitioner();

   public Iqicorecommunicationrequest setSender(Reference param);

   public Practitioner getSenderPractitionerTarget();

   public Iqicorecommunicationrequest setSenderTarget(Practitioner param);

   public qicorepractitionerAdapter getSenderPractitionerAdapterTarget();

   public Iqicorecommunicationrequest setSenderAdapterTarget(
         qicorepractitionerAdapter param);

   public Reference getSenderPatient();

   public Patient getSenderPatientTarget();

   public Iqicorecommunicationrequest setSenderTarget(Patient param);

   public qicorepatientAdapter getSenderPatientAdapterTarget();

   public Iqicorecommunicationrequest setSenderAdapterTarget(
         qicorepatientAdapter param);

   public Reference getSenderDevice();

   public Device getSenderDeviceTarget();

   public Iqicorecommunicationrequest setSenderTarget(Device param);

   public qicoredeviceAdapter getSenderDeviceAdapterTarget();

   public Iqicorecommunicationrequest setSenderAdapterTarget(
         qicoredeviceAdapter param);

   public Reference getSenderRelatedPerson();

   public RelatedPerson getSenderRelatedPersonTarget();

   public Iqicorecommunicationrequest setSenderTarget(RelatedPerson param);

   public qicorerelatedpersonAdapter getSenderRelatedPersonAdapterTarget();

   public Iqicorecommunicationrequest setSenderAdapterTarget(
         qicorerelatedpersonAdapter param);

   public Reference getSenderOrganization();

   public Organization getSenderOrganizationTarget();

   public Iqicorecommunicationrequest setSenderTarget(Organization param);

   public qicoreorganizationAdapter getSenderOrganizationAdapterTarget();

   public Iqicorecommunicationrequest setSenderAdapterTarget(
         qicoreorganizationAdapter param);

   public Type getScheduled();

   public Iqicorecommunicationrequest setScheduled(Type param);

   public DateTimeType getScheduledDateTimeType();

   public boolean hasScheduledDateTimeType();

   public Period getScheduledPeriod();

   public boolean hasScheduledPeriod();

   public boolean hasId();

   public boolean hasIdElement();

   public IdType getIdElement();

   public String getId();

   public Iqicorecommunicationrequest setIdElement(IdType param);

   public Iqicorecommunicationrequest setId(String param);

   public List<CodeableConcept> getReason();

   public Iqicorecommunicationrequest setReason(List<CodeableConcept> param);

   public boolean hasReason();

   public Iqicorecommunicationrequest addReason(CodeableConcept param);

   public CodeableConcept addReason();
}