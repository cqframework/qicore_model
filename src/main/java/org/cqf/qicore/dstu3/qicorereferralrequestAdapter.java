package org.cqf.qicore.dstu3;

import org.hl7.fhir.dstu3.model.ReferralRequest;
import org.hl7.fhir.dstu3.model.Reference;
import java.util.List;
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
import org.hl7.fhir.dstu3.model.*;

public class qicorereferralrequestAdapter implements Iqicorereferralrequest
{

   private ReferralRequest adaptedClass;

   public qicorereferralrequestAdapter()
   {
      this.adaptedClass = new org.hl7.fhir.dstu3.model.ReferralRequest();
   }

   public qicorereferralrequestAdapter(ReferralRequest adaptee)
   {
      this.adaptedClass = adaptee;
   }

   public ReferralRequest getAdaptee()
   {
      return adaptedClass;
   }

   public void setAdaptee(ReferralRequest param)
   {
      this.adaptedClass = param;
   }

   public boolean hasSupportingInformation()
   {
      return adaptedClass.hasSupportingInfo();
   }

   public List<Reference> getSupportingInformation()
   {
      return adaptedClass.getSupportingInfo();
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

   public Iqicorereferralrequest setLanguageElement(CodeType param)
   {
      adaptedClass.setLanguageElement(param);
      return this;
   }

   public Iqicorereferralrequest setLanguage(String param)
   {
      adaptedClass.setLanguage(param);
      return this;
   }

   public boolean hasBasedOn()
   {
      return adaptedClass.hasBasedOn();
   }

   public List<ReferralRequest> getBasedOnReferralRequestTarget() {
		List<org.hl7.fhir.dstu3.model.ReferralRequest> items = new java.util.ArrayList<>();
		List<org.hl7.fhir.dstu3.model.Resource> resources = adaptedClass
				.getBasedOnTarget();
		for (org.hl7.fhir.dstu3.model.Resource resource : resources) {
			items.add((org.hl7.fhir.dstu3.model.ReferralRequest) resource);
		}
		return items;
	}

   public List<Reference> getBasedOn()
   {
      return adaptedClass.getBasedOn();
   }

   public List<CarePlan> getBasedOnCarePlanTarget() {
		List<org.hl7.fhir.dstu3.model.CarePlan> items = new java.util.ArrayList<>();
		List<org.hl7.fhir.dstu3.model.Resource> resources = adaptedClass
				.getBasedOnTarget();
		for (org.hl7.fhir.dstu3.model.Resource resource : resources) {
			items.add((org.hl7.fhir.dstu3.model.CarePlan) resource);
		}
		return items;
	}

   public List<ProcedureRequest> getBasedOnProcedureRequestTarget() {
		List<org.hl7.fhir.dstu3.model.ProcedureRequest> items = new java.util.ArrayList<>();
		List<org.hl7.fhir.dstu3.model.Resource> resources = adaptedClass
				.getBasedOnTarget();
		for (org.hl7.fhir.dstu3.model.Resource resource : resources) {
			items.add((org.hl7.fhir.dstu3.model.ProcedureRequest) resource);
		}
		return items;
	}

   public ReferralRequest.ReferralPriority getPriority()
   {
      try
      {
         return adaptedClass.getPriority();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Priority", e);
      }
   }

   public Iqicorereferralrequest setPriority(ReferralRequest.ReferralPriority param)
   {
      adaptedClass.setPriority(param);
      return this;
   }

   public boolean hasPriority()
   {
      return adaptedClass.hasPriority();
   }

   public Reference getSubject()
   {
      try
      {
         return adaptedClass.getSubject();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Parent", e);
      }
   }

   public Iqicorereferralrequest setSubject(Reference param)
   {
      adaptedClass.setSubject(param);
      return this;
   }

   public boolean hasSubject()
   {
      return adaptedClass.hasSubject();
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

   public Iqicorereferralrequest setImplicitRulesElement(UriType param)
   {
      adaptedClass.setImplicitRulesElement(param);
      return this;
   }

   public Iqicorereferralrequest setImplicitRules(String param)
   {
      adaptedClass.setImplicitRules(param);
      return this;
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

   public Iqicorereferralrequest setContained(List<Resource> param)
   {
      adaptedClass.setContained(param);
      return this;
   }

   public boolean hasContained()
   {
      return adaptedClass.hasContained();
   }

   public Iqicorereferralrequest addContained(Resource param)
   {
      adaptedClass.addContained(param);
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
         throw new RuntimeException("Error getting Context", e);
      }
   }

   public Iqicorereferralrequest setContext(Reference param)
   {
      adaptedClass.setContext(param);
      return this;
   }

   public Encounter getContextTarget()
   {
      return (org.hl7.fhir.dstu3.model.Encounter) adaptedClass
            .getContextTarget();
   }

   public Iqicorereferralrequest setContextTarget(Encounter param)
   {
      adaptedClass.setContextTarget(param);
      return this;
   }

   public qicoreencounterAdapter getContextAdapterTarget()
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

   public Iqicorereferralrequest setContextAdapterTarget(
         qicoreencounterAdapter param)
   {
      adaptedClass.setContextTarget(param.getAdaptee());
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

   public Iqicorereferralrequest setIdElement(IdType param)
   {
      adaptedClass.setIdElement(param);
      return this;
   }

   public Iqicorereferralrequest setId(String param)
   {
      adaptedClass.setId(param);
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

   public ReferralRequest.ReferralRequestStatus getStatus()
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

   public Enumeration<ReferralRequest.ReferralRequestStatus> getStatusElement()
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

   public Iqicorereferralrequest setStatus(ReferralRequest.ReferralRequestStatus param)
   {
      adaptedClass.setStatus(param);
      return this;
   }

   public Iqicorereferralrequest setStatusElement(
           Enumeration<ReferralRequest.ReferralRequestStatus> param)
   {
      adaptedClass.setStatusElement(param);
      return this;
   }

   public List<CodeableConcept> getServiceRequested()
   {
      try
      {
         return adaptedClass.getServiceRequested();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting ServiceRequested", e);
      }
   }

   public Iqicorereferralrequest setServiceRequested(
         List<CodeableConcept> param)
   {
      adaptedClass.setServiceRequested(param);
      return this;
   }

   public boolean hasServiceRequested()
   {
      return adaptedClass.hasServiceRequested();
   }

   public Iqicorereferralrequest addServiceRequested(CodeableConcept param)
   {
      adaptedClass.addServiceRequested(param);
      return this;
   }

   public CodeableConcept addServiceRequested()
   {
      return adaptedClass.addServiceRequested();
   }

   public boolean hasPatient()
   {
      return adaptedClass.hasSubject();
   }

   public Reference getPatient()
   {
      try
      {
         return adaptedClass.getSubject();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Patient", e);
      }
   }

   public Iqicorereferralrequest setPatient(Reference param)
   {
      adaptedClass.setSubject(param);
      return this;
   }

   public Patient getPatientTarget()
   {
      return (org.hl7.fhir.dstu3.model.Patient) adaptedClass
            .getSubjectTarget();
   }

   public Iqicorereferralrequest setPatientTarget(Patient param)
   {
      adaptedClass.setSubjectTarget(param);
      return this;
   }

   public qicorepatientAdapter getPatientAdapterTarget()
   {
      if (adaptedClass.getSubject().getResource() instanceof org.hl7.fhir.dstu3.model.Patient)
      {
         qicorepatientAdapter profiledType = new qicorepatientAdapter();
         profiledType
               .setAdaptee((org.hl7.fhir.dstu3.model.Patient) adaptedClass
                     .getSubject().getResource());
         return profiledType;
      }
      else
      {
         return null;
      }
   }

   public Iqicorereferralrequest setPatientAdapterTarget(
         qicorepatientAdapter param)
   {
      adaptedClass.setSubjectTarget(param.getAdaptee());
      return this;
   }

   public CodeableConcept getSpecialty()
   {
      try
      {
         return adaptedClass.getSpecialty();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Specialty", e);
      }
   }

   public Iqicorereferralrequest setSpecialty(CodeableConcept param)
   {
      adaptedClass.setSpecialty(param);
      return this;
   }

   public boolean hasSpecialty()
   {
      return adaptedClass.hasSpecialty();
   }

   public Period getOccurrencePeriod()
   {
      try
      {
         return adaptedClass.getOccurrencePeriod();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting OccurrencePeriod", e);
      }
   }

   public Iqicorereferralrequest setFulfillmentTime(Period param)
   {
      adaptedClass.setOccurrence(param);
      return this;
   }

   public boolean hasOccurrencePeriod()
   {
      return adaptedClass.hasOccurrencePeriod();
   }

   public ReferralRequest.ReferralRequestRequesterComponent getRequester()
   {
      try
      {
         return adaptedClass.getRequester();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Requester", e);
      }
   }

   public Resource getRequesterTarget()
   {
      try
      {
         return adaptedClass.getRequester().getAgentTarget();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting RequesterTarget", e);
      }
   }

   public boolean hasRequester()
   {
      return adaptedClass.hasRequester();
   }

   public Reference getRequesterPractitioner()
   {
      try
      {
         return adaptedClass.getRequester().getAgent();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Requester", e);
      }
   }

   public Iqicorereferralrequest setRequester(Reference param)
   {
      adaptedClass.getRequester().setAgent(param);
      return this;
   }

   public Practitioner getRequesterPractitionerTarget()
   {
      return (org.hl7.fhir.dstu3.model.Practitioner) adaptedClass
            .getRequester().getAgentTarget();
   }

   public Iqicorereferralrequest setRequesterTarget(Practitioner param)
   {
      adaptedClass.getRequester().setAgentTarget(param);
      return this;
   }

   public qicorepractitionerAdapter getRequesterPractitionerAdapterTarget()
   {
      if (adaptedClass.getRequester().getAgentTarget() instanceof org.hl7.fhir.dstu3.model.Practitioner)
      {
         qicorepractitionerAdapter profiledType = new qicorepractitionerAdapter();
         profiledType
               .setAdaptee((org.hl7.fhir.dstu3.model.Practitioner) adaptedClass
                     .getRequester().getAgentTarget());
         return profiledType;
      }
      else
      {
         return null;
      }
   }

   public Iqicorereferralrequest setRequesterAdapterTarget(
         qicorepractitionerAdapter param)
   {
      adaptedClass.getRequester().setAgentTarget(param.getAdaptee());
      return this;
   }

   public Reference getRequesterOrganization()
   {
      try
      {
         return adaptedClass.getRequester().getAgent();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Requester", e);
      }
   }

   public Organization getRequesterOrganizationTarget()
   {
      return (org.hl7.fhir.dstu3.model.Organization) adaptedClass
            .getRequester().getAgentTarget();
   }

   public Iqicorereferralrequest setRequesterTarget(Organization param)
   {
      adaptedClass.getRequester().setAgentTarget(param);
      return this;
   }

   public qicoreorganizationAdapter getRequesterOrganizationAdapterTarget()
   {
      if (adaptedClass.getRequester().getAgentTarget() instanceof org.hl7.fhir.dstu3.model.Organization)
      {
         qicoreorganizationAdapter profiledType = new qicoreorganizationAdapter();
         profiledType
               .setAdaptee((org.hl7.fhir.dstu3.model.Organization) adaptedClass
                     .getRequester().getAgentTarget());
         return profiledType;
      }
      else
      {
         return null;
      }
   }

   public Iqicorereferralrequest setRequesterAdapterTarget(
         qicoreorganizationAdapter param)
   {
      adaptedClass.getRequester().setAgentTarget(param.getAdaptee());
      return this;
   }

   public Reference getRequesterPatient()
   {
      try
      {
         return adaptedClass.getRequester().getAgent();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Requester", e);
      }
   }

   public Patient getRequesterPatientTarget()
   {
      return (org.hl7.fhir.dstu3.model.Patient) adaptedClass
            .getRequester().getAgentTarget();
   }

   public Iqicorereferralrequest setRequesterTarget(Patient param)
   {
      adaptedClass.getRequester().setAgentTarget(param);
      return this;
   }

   public qicorepatientAdapter getRequesterPatientAdapterTarget()
   {
      if (adaptedClass.getRequester().getAgentTarget() instanceof org.hl7.fhir.dstu3.model.Patient)
      {
         qicorepatientAdapter profiledType = new qicorepatientAdapter();
         profiledType
               .setAdaptee((org.hl7.fhir.dstu3.model.Patient) adaptedClass
                     .getRequester().getAgentTarget());
         return profiledType;
      }
      else
      {
         return null;
      }
   }

   public Iqicorereferralrequest setRequesterAdapterTarget(
         qicorepatientAdapter param)
   {
      adaptedClass.getRequester().setAgentTarget(param.getAdaptee());
      return this;
   }

   public boolean hasIntent()
   {
      return adaptedClass.hasIntent();
   }

   public boolean hasIntentElement()
   {
      return adaptedClass.hasIntentElement();
   }

   public ReferralRequest.ReferralCategory getIntent()
   {
      try
      {
         return adaptedClass.getIntent();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Category", e);
      }
   }

   public Enumeration<ReferralRequest.ReferralCategory> getIntentElement()
   {
      try
      {
         return adaptedClass.getIntentElement();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting CategoryElement", e);
      }
   }

   public Iqicorereferralrequest setIntent(
         ReferralRequest.ReferralCategory param)
   {
      adaptedClass.setIntent(param);
      return this;
   }

   public Iqicorereferralrequest setIntentElement(
         Enumeration<ReferralRequest.ReferralCategory> param)
   {
      adaptedClass.setIntentElement(param);
      return this;
   }

   public CodeableConcept getRefusalReason()
   {
      List<org.hl7.fhir.dstu3.model.Extension> extensions = adaptedClass
            .getExtensionsByUrl("http://hl7.org/fhir/StructureDefinition/referralrequest-reasonRefused");
      if (extensions == null || extensions.size() <= 0)
      {
         return null;
      }
      else if (extensions.size() == 1)
      {
         return (org.hl7.fhir.dstu3.model.CodeableConcept) extensions.get(0)
               .getValue();
      }
      else
      {
         throw new RuntimeException(
               "More than one extension exists for refusalReason");
      }
   }

   public Iqicorereferralrequest setRefusalReason(CodeableConcept param)
   {
      adaptedClass
            .addExtension()
            .setUrl("http://hl7.org/fhir/StructureDefinition/referralrequest-reasonRefused")
            .setValue(param);
      return this;
   }

   public boolean hasDescription()
   {
      return adaptedClass.hasDescription();
   }

   public boolean hasDescriptionElement()
   {
      return adaptedClass.hasDescriptionElement();
   }

   public StringType getDescriptionElement()
   {
      try
      {
         return adaptedClass.getDescriptionElement();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting DescriptionElement", e);
      }
   }

   public String getDescription()
   {
      try
      {
         return adaptedClass.getDescription();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Description", e);
      }
   }

   public Iqicorereferralrequest setDescriptionElement(StringType param)
   {
      adaptedClass.setDescriptionElement(param);
      return this;
   }

   public Iqicorereferralrequest setDescription(String param)
   {
      adaptedClass.setDescription(param);
      return this;
   }

   public boolean hasRecipient()
   {
      return adaptedClass.hasRecipient();
   }

   public List<Practitioner> getRecipientPractitionerTarget() {
		List<org.hl7.fhir.dstu3.model.Practitioner> items = new java.util.ArrayList<>();
		List<org.hl7.fhir.dstu3.model.Resource> resources = adaptedClass
				.getRecipientTarget();
		for (org.hl7.fhir.dstu3.model.Resource resource : resources) {
			items.add((org.hl7.fhir.dstu3.model.Practitioner) resource);
		}
		return items;
	}

   public List<Reference> getRecipient()
   {
      return adaptedClass.getRecipient();
   }

   public List<Organization> getRecipientOrganizationTarget() {
		List<org.hl7.fhir.dstu3.model.Organization> items = new java.util.ArrayList<>();
		List<org.hl7.fhir.dstu3.model.Resource> resources = adaptedClass
				.getRecipientTarget();
		for (org.hl7.fhir.dstu3.model.Resource resource : resources) {
			items.add((org.hl7.fhir.dstu3.model.Organization) resource);
		}
		return items;
	}

   public List<CodeableConcept> getReasonCode()
   {
      try
      {
         return adaptedClass.getReasonCode();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Reason", e);
      }
   }

   public Iqicorereferralrequest setReasonCode(List<CodeableConcept> param)
   {
      adaptedClass.setReasonCode(param);
      return this;
   }

   public boolean hasReasonCode()
   {
      return adaptedClass.hasReasonCode();
   }

   public CodeableConcept getType()
   {
      try
      {
         return adaptedClass.getType();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Type", e);
      }
   }

   public Iqicorereferralrequest setType(CodeableConcept param)
   {
      adaptedClass.setType(param);
      return this;
   }

   public boolean hasType()
   {
      return adaptedClass.hasType();
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

   public Iqicorereferralrequest setIdentifier(List<Identifier> param)
   {
      adaptedClass.setIdentifier(param);
      return this;
   }

   public boolean hasIdentifier()
   {
      return adaptedClass.hasIdentifier();
   }

   public Iqicorereferralrequest addIdentifier(Identifier param)
   {
      adaptedClass.addIdentifier(param);
      return this;
   }

   public Identifier addIdentifier()
   {
      return adaptedClass.addIdentifier();
   }
}
