package org.cqf.qicore.dstu3;

import org.hl7.fhir.dstu3.model.ReferralRequest;
import org.hl7.fhir.dstu3.model.*;

import java.util.List;

import org.hl7.fhir.dstu3.model.Reference;
import org.hl7.fhir.dstu3.model.CodeType;

import java.lang.String;

import org.hl7.fhir.dstu3.model.CodeableConcept;
import org.hl7.fhir.dstu3.model.Identifier;
import org.hl7.fhir.dstu3.model.UriType;
import org.hl7.fhir.dstu3.model.Resource;
import org.hl7.fhir.dstu3.model.Encounter;
import org.hl7.fhir.dstu3.model.IdType;
import org.hl7.fhir.dstu3.model.Enumeration;
import org.hl7.fhir.dstu3.model.Patient;
import org.hl7.fhir.dstu3.model.Period;
import org.hl7.fhir.dstu3.model.Practitioner;
import org.hl7.fhir.dstu3.model.Organization;
import org.hl7.fhir.dstu3.model.StringType;

public interface Iqicorereferralrequest
{

   public ReferralRequest getAdaptee();

   public void setAdaptee(ReferralRequest param);

   public boolean hasSupportingInformation();

   public List<Reference> getSupportingInformation();

   public boolean hasLanguage();

   public boolean hasLanguageElement();

   public CodeType getLanguageElement();

   public String getLanguage();

   public Iqicorereferralrequest setLanguageElement(CodeType param);

   public Iqicorereferralrequest setLanguage(String param);

   public boolean hasBasedOn();

   public List<ReferralRequest> getBasedOnReferralRequestTarget();

   public List<Reference> getBasedOn();

   public List<CarePlan> getBasedOnCarePlanTarget();

    public List<ProcedureRequest> getBasedOnProcedureRequestTarget();

   public ReferralRequest.ReferralPriority getPriority();

   public Iqicorereferralrequest setPriority(ReferralRequest.ReferralPriority param);

   public boolean hasPriority();

   public Reference getSubject();

   public Iqicorereferralrequest setSubject(Reference param);

   public boolean hasSubject();

   public boolean hasImplicitRules();

   public boolean hasImplicitRulesElement();

   public UriType getImplicitRulesElement();

   public String getImplicitRules();

   public Iqicorereferralrequest setImplicitRulesElement(UriType param);

   public Iqicorereferralrequest setImplicitRules(String param);

   public List<Resource> getContained();

   public Iqicorereferralrequest setContained(List<Resource> param);

   public boolean hasContained();

   public Iqicorereferralrequest addContained(Resource param);

   public boolean hasContext();

   public Reference getContext();

   public Iqicorereferralrequest setContext(Reference param);

   public Encounter getContextTarget();

   public Iqicorereferralrequest setContextTarget(Encounter param);

   public qicoreencounterAdapter getContextAdapterTarget();

   public Iqicorereferralrequest setContextAdapterTarget(
         qicoreencounterAdapter param);

   public boolean hasId();

   public boolean hasIdElement();

   public IdType getIdElement();

   public String getId();

   public Iqicorereferralrequest setIdElement(IdType param);

   public Iqicorereferralrequest setId(String param);

   public boolean hasStatus();

   public boolean hasStatusElement();

   public ReferralRequest.ReferralRequestStatus getStatus();

   public Enumeration<ReferralRequest.ReferralRequestStatus> getStatusElement();

   public Iqicorereferralrequest setStatus(ReferralRequest.ReferralRequestStatus param);

   public Iqicorereferralrequest setStatusElement(
           Enumeration<ReferralRequest.ReferralRequestStatus> param);

   public List<CodeableConcept> getServiceRequested();

   public Iqicorereferralrequest setServiceRequested(
         List<CodeableConcept> param);

   public boolean hasServiceRequested();

   public Iqicorereferralrequest addServiceRequested(CodeableConcept param);

   public CodeableConcept addServiceRequested();

   public boolean hasPatient();

   public Reference getPatient();

   public Iqicorereferralrequest setPatient(Reference param);

   public Patient getPatientTarget();

   public Iqicorereferralrequest setPatientTarget(Patient param);

   public qicorepatientAdapter getPatientAdapterTarget();

   public Iqicorereferralrequest setPatientAdapterTarget(
         qicorepatientAdapter param);

   public CodeableConcept getSpecialty();

   public Iqicorereferralrequest setSpecialty(CodeableConcept param);

   public boolean hasSpecialty();

   public Period getOccurrencePeriod();

   public Iqicorereferralrequest setFulfillmentTime(Period param);

   public boolean hasOccurrencePeriod();

   public ReferralRequest.ReferralRequestRequesterComponent getRequester();

   public Resource getRequesterTarget();

   public boolean hasRequester();

   public Reference getRequesterPractitioner();

   public Iqicorereferralrequest setRequester(Reference param);

   public Practitioner getRequesterPractitionerTarget();

   public Iqicorereferralrequest setRequesterTarget(Practitioner param);

   public qicorepractitionerAdapter getRequesterPractitionerAdapterTarget();

   public Iqicorereferralrequest setRequesterAdapterTarget(
         qicorepractitionerAdapter param);

   public Reference getRequesterOrganization();

   public Organization getRequesterOrganizationTarget();

   public Iqicorereferralrequest setRequesterTarget(Organization param);

   public qicoreorganizationAdapter getRequesterOrganizationAdapterTarget();

   public Iqicorereferralrequest setRequesterAdapterTarget(
         qicoreorganizationAdapter param);

   public Reference getRequesterPatient();

   public Patient getRequesterPatientTarget();

   public Iqicorereferralrequest setRequesterTarget(Patient param);

   public qicorepatientAdapter getRequesterPatientAdapterTarget();

   public Iqicorereferralrequest setRequesterAdapterTarget(
         qicorepatientAdapter param);

   public boolean hasIntent();

   public boolean hasIntentElement();

   public ReferralRequest.ReferralCategory getIntent();

   public Enumeration<ReferralRequest.ReferralCategory> getIntentElement();

   public Iqicorereferralrequest setIntent(
         ReferralRequest.ReferralCategory param);

   public Iqicorereferralrequest setIntentElement(
         Enumeration<ReferralRequest.ReferralCategory> param);

   public CodeableConcept getRefusalReason();

   public Iqicorereferralrequest setRefusalReason(CodeableConcept param);

   public boolean hasDescription();

   public boolean hasDescriptionElement();

   public StringType getDescriptionElement();

   public String getDescription();

   public Iqicorereferralrequest setDescriptionElement(StringType param);

   public Iqicorereferralrequest setDescription(String param);

   public boolean hasRecipient();

   public List<Practitioner> getRecipientPractitionerTarget();

   public List<Reference> getRecipient();

   public List<Organization> getRecipientOrganizationTarget();

   public List<CodeableConcept> getReasonCode();

   public Iqicorereferralrequest setReasonCode(List<CodeableConcept> param);

   public boolean hasReasonCode();

   public CodeableConcept getType();

   public Iqicorereferralrequest setType(CodeableConcept param);

   public boolean hasType();

   public List<Identifier> getIdentifier();

   public Iqicorereferralrequest setIdentifier(List<Identifier> param);

   public boolean hasIdentifier();

   public Iqicorereferralrequest addIdentifier(Identifier param);

   public Identifier addIdentifier();
}
