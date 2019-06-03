package org.cqf.qicore.dstu3;

import org.hl7.fhir.dstu3.model.CommunicationRequest;
import org.hl7.fhir.dstu3.model.Resource;
import java.util.List;
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

public class qicorecommunicationrequestAdapter implements Iqicorecommunicationrequest
{

   private CommunicationRequest adaptedClass;

   public qicorecommunicationrequestAdapter()
   {
      this.adaptedClass = new org.hl7.fhir.dstu3.model.CommunicationRequest();
   }

   public qicorecommunicationrequestAdapter(CommunicationRequest adaptee)
   {
      this.adaptedClass = adaptee;
   }

   public CommunicationRequest getAdaptee()
   {
      return adaptedClass;
   }

   public void setAdaptee(CommunicationRequest param)
   {
      this.adaptedClass = param;
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

   public Iqicorecommunicationrequest setContained(List<Resource> param)
   {
      adaptedClass.setContained(param);
      return this;
   }

   public boolean hasContained()
   {
      return adaptedClass.hasContained();
   }

   public Iqicorecommunicationrequest addContained(Resource param)
   {
      adaptedClass.addContained(param);
      return this;
   }

   public Reference getRequester()
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

   public Iqicorecommunicationrequest setRequester(Reference param)
   {
      adaptedClass.getRequester().setAgent(param);
      return this;
   }

   public Patient getRequesterPatientTarget()
   {
      return (org.hl7.fhir.dstu3.model.Patient) adaptedClass
            .getRequester().getAgentTarget();
   }

   public Iqicorecommunicationrequest setRequesterTarget(Patient param)
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

   public Iqicorecommunicationrequest setRequesterAdapterTarget(
         qicorepatientAdapter param)
   {
      adaptedClass.getRequester().setAgentTarget(param.getAdaptee());
      return this;
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

   public Practitioner getRequesterPractitionerTarget()
   {
      return (org.hl7.fhir.dstu3.model.Practitioner) adaptedClass
            .getRequester().getAgentTarget();
   }

   public Iqicorecommunicationrequest setRequesterTarget(Practitioner param)
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

   public Iqicorecommunicationrequest setRequesterAdapterTarget(
         qicorepractitionerAdapter param)
   {
      adaptedClass.getRequester().setAgentTarget(param.getAdaptee());
      return this;
   }

   public Reference getRequesterRelatedPerson()
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

   public RelatedPerson getRequesterRelatedPersonTarget()
   {
      return (org.hl7.fhir.dstu3.model.RelatedPerson) adaptedClass
            .getRequester().getAgentTarget();
   }

   public Iqicorecommunicationrequest setRequesterTarget(RelatedPerson param)
   {
      adaptedClass.getRequester().setAgentTarget(param);
      return this;
   }

   public qicorerelatedpersonAdapter getRequesterRelatedPersonAdapterTarget()
   {
      if (adaptedClass.getRequester().getAgentTarget() instanceof org.hl7.fhir.dstu3.model.RelatedPerson)
      {
         qicorerelatedpersonAdapter profiledType = new qicorerelatedpersonAdapter();
         profiledType
               .setAdaptee((org.hl7.fhir.dstu3.model.RelatedPerson) adaptedClass
                     .getRequester().getAgentTarget());
         return profiledType;
      }
      else
      {
         return null;
      }
   }

   public Iqicorecommunicationrequest setRequesterAdapterTarget(
         qicorerelatedpersonAdapter param)
   {
      adaptedClass.getRequester().setAgentTarget(param.getAdaptee());
      return this;
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

   public Iqicorecommunicationrequest setLanguageElement(CodeType param)
   {
      adaptedClass.setLanguageElement(param);
      return this;
   }

   public Iqicorecommunicationrequest setLanguage(String param)
   {
      adaptedClass.setLanguage(param);
      return this;
   }

   public CodeableConcept getReasonRejected()
   {
      List<org.hl7.fhir.dstu3.model.Extension> extensions = adaptedClass
            .getExtensionsByUrl("http://hl7.org/fhir/StructureDefinition/communicationrequest-reasonRejected");
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
               "More than one extension exists for reasonRejected");
      }
   }

   public Iqicorecommunicationrequest setReasonRejected(CodeableConcept param)
   {
      adaptedClass
            .addExtension()
            .setUrl("http://hl7.org/fhir/StructureDefinition/communicationrequest-reasonRejected")
            .setValue(param);
      return this;
   }

   public List<CodeableConcept> getMedium()
   {
      try
      {
         return adaptedClass.getMedium();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Medium", e);
      }
   }

   public Iqicorecommunicationrequest setMedium(List<CodeableConcept> param)
   {
      adaptedClass.setMedium(param);
      return this;
   }

   public boolean hasMedium()
   {
      return adaptedClass.hasMedium();
   }

   public Iqicorecommunicationrequest addMedium(CodeableConcept param)
   {
      adaptedClass.addMedium(param);
      return this;
   }

   public CodeableConcept addMedium()
   {
      return adaptedClass.addMedium();
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

   public Iqicorecommunicationrequest setImplicitRulesElement(UriType param)
   {
      adaptedClass.setImplicitRulesElement(param);
      return this;
   }

   public Iqicorecommunicationrequest setImplicitRules(String param)
   {
      adaptedClass.setImplicitRules(param);
      return this;
   }

   public List<CommunicationRequest.CommunicationRequestPayloadComponent> getPayload()
   {
      try
      {
         return adaptedClass.getPayload();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Payload", e);
      }
   }

   public qicorecommunicationrequestAdapter setPayload(
         List<CommunicationRequest.CommunicationRequestPayloadComponent> param)
   {
      adaptedClass.setPayload(param);
      return this;
   }

   public boolean hasPayload()
   {
      return adaptedClass.hasPayload();
   }

   public qicorecommunicationrequestAdapter addPayload(
         CommunicationRequest.CommunicationRequestPayloadComponent param)
   {
      adaptedClass.addPayload(param);
      return this;
   }

   public CommunicationRequest.CommunicationRequestPayloadComponent addPayload()
   {
      return adaptedClass.addPayload();
   }

   public CommunicationRequest.CommunicationPriority getPriority()
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

   public Iqicorecommunicationrequest setPriority(CommunicationRequest.CommunicationPriority param)
   {
      adaptedClass.setPriority(param);
      return this;
   }

   public boolean hasPriority()
   {
      return adaptedClass.hasPriority();
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

   public Iqicorecommunicationrequest setContext (Reference param)
   {
      adaptedClass.setContext(param);
      return this;
   }

   public Encounter getContextTarget()
   {
      return (org.hl7.fhir.dstu3.model.Encounter) adaptedClass
            .getContextTarget();
   }

   public Iqicorecommunicationrequest setContextTarget(Resource param)
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

   public Iqicorecommunicationrequest setContextAdapterTarget(
         qicoreencounterAdapter param)
   {
      adaptedClass.setContextTarget(param.getAdaptee());
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

   public CommunicationRequest.CommunicationRequestStatus getStatus()
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

   public Enumeration<CommunicationRequest.CommunicationRequestStatus> getStatusElement()
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

   public Iqicorecommunicationrequest setStatus(
         CommunicationRequest.CommunicationRequestStatus param)
   {
      adaptedClass.setStatus(param);
      return this;
   }

   public Iqicorecommunicationrequest setStatusElement(
         Enumeration<CommunicationRequest.CommunicationRequestStatus> param)
   {
      adaptedClass.setStatusElement(param);
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

   public List<Patient> getRecipientPatientTarget() {
		List<org.hl7.fhir.dstu3.model.Patient> items = new java.util.ArrayList<>();
		List<org.hl7.fhir.dstu3.model.Resource> resources = adaptedClass
				.getRecipientTarget();
		for (org.hl7.fhir.dstu3.model.Resource resource : resources) {
			items.add((org.hl7.fhir.dstu3.model.Patient) resource);
		}
		return items;
	}

   public List<Device> getRecipientDeviceTarget() {
		List<org.hl7.fhir.dstu3.model.Device> items = new java.util.ArrayList<>();
		List<org.hl7.fhir.dstu3.model.Resource> resources = adaptedClass
				.getRecipientTarget();
		for (org.hl7.fhir.dstu3.model.Resource resource : resources) {
			items.add((org.hl7.fhir.dstu3.model.Device) resource);
		}
		return items;
	}

   public List<RelatedPerson> getRecipientRelatedPersonTarget() {
		List<org.hl7.fhir.dstu3.model.RelatedPerson> items = new java.util.ArrayList<>();
		List<org.hl7.fhir.dstu3.model.Resource> resources = adaptedClass
				.getRecipientTarget();
		for (org.hl7.fhir.dstu3.model.Resource resource : resources) {
			items.add((org.hl7.fhir.dstu3.model.RelatedPerson) resource);
		}
		return items;
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

   public boolean hasSubject()
   {
      return adaptedClass.hasSubject();
   }

   public Reference getSubject()
   {
      try
      {
         return adaptedClass.getSubject();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Subject", e);
      }
   }

   public Iqicorecommunicationrequest setSubject(Reference param)
   {
      adaptedClass.setSubject(param);
      return this;
   }

   public Patient getSubjectTarget()
   {
      return (org.hl7.fhir.dstu3.model.Patient) adaptedClass
            .getSubjectTarget();
   }

   public Iqicorecommunicationrequest setSubjectTarget(Patient param)
   {
      adaptedClass.setSubjectTarget(param);
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

   public Iqicorecommunicationrequest setIdentifier(List<Identifier> param)
   {
      adaptedClass.setIdentifier(param);
      return this;
   }

   public boolean hasIdentifier()
   {
      return adaptedClass.hasIdentifier();
   }

   public Iqicorecommunicationrequest addIdentifier(Identifier param)
   {
      adaptedClass.addIdentifier(param);
      return this;
   }

   public Identifier addIdentifier()
   {
      return adaptedClass.addIdentifier();
   }

   public List<CodeableConcept> getCategory()
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

   public Iqicorecommunicationrequest setCategory(List<CodeableConcept> param)
   {
      adaptedClass.setCategory(param);
      return this;
   }

   public boolean hasCategory()
   {
      return adaptedClass.hasCategory();
   }

   public Reference getSender()
   {
      try
      {
         return adaptedClass.getSender();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Sender", e);
      }
   }

   public Resource getSenderTarget()
   {
      try
      {
         return adaptedClass.getSenderTarget();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting SenderTarget", e);
      }
   }

   public boolean hasSender()
   {
      return adaptedClass.hasSender();
   }

   public Reference getSenderPractitioner()
   {
      try
      {
         return adaptedClass.getSender();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Sender", e);
      }
   }

   public Iqicorecommunicationrequest setSender(Reference param)
   {
      adaptedClass.setSender(param);
      return this;
   }

   public Practitioner getSenderPractitionerTarget()
   {
      return (org.hl7.fhir.dstu3.model.Practitioner) adaptedClass
            .getSenderTarget();
   }

   public Iqicorecommunicationrequest setSenderTarget(Practitioner param)
   {
      adaptedClass.setSenderTarget(param);
      return this;
   }

   public qicorepractitionerAdapter getSenderPractitionerAdapterTarget()
   {
      if (adaptedClass.getSender().getResource() instanceof org.hl7.fhir.dstu3.model.Practitioner)
      {
         qicorepractitionerAdapter profiledType = new qicorepractitionerAdapter();
         profiledType
               .setAdaptee((org.hl7.fhir.dstu3.model.Practitioner) adaptedClass
                     .getSender().getResource());
         return profiledType;
      }
      else
      {
         return null;
      }
   }

   public Iqicorecommunicationrequest setSenderAdapterTarget(
         qicorepractitionerAdapter param)
   {
      adaptedClass.setSenderTarget(param.getAdaptee());
      return this;
   }

   public Reference getSenderPatient()
   {
      try
      {
         return adaptedClass.getSender();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Sender", e);
      }
   }

   public Patient getSenderPatientTarget()
   {
      return (org.hl7.fhir.dstu3.model.Patient) adaptedClass
            .getSenderTarget();
   }

   public Iqicorecommunicationrequest setSenderTarget(Patient param)
   {
      adaptedClass.setSenderTarget(param);
      return this;
   }

   public qicorepatientAdapter getSenderPatientAdapterTarget()
   {
      if (adaptedClass.getSender().getResource() instanceof org.hl7.fhir.dstu3.model.Patient)
      {
         qicorepatientAdapter profiledType = new qicorepatientAdapter();
         profiledType
               .setAdaptee((org.hl7.fhir.dstu3.model.Patient) adaptedClass
                     .getSender().getResource());
         return profiledType;
      }
      else
      {
         return null;
      }
   }

   public Iqicorecommunicationrequest setSenderAdapterTarget(
         qicorepatientAdapter param)
   {
      adaptedClass.setSenderTarget(param.getAdaptee());
      return this;
   }

   public Reference getSenderDevice()
   {
      try
      {
         return adaptedClass.getSender();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Sender", e);
      }
   }

   public Device getSenderDeviceTarget()
   {
      return (org.hl7.fhir.dstu3.model.Device) adaptedClass.getSenderTarget();
   }

   public Iqicorecommunicationrequest setSenderTarget(Device param)
   {
      adaptedClass.setSenderTarget(param);
      return this;
   }

   public qicoredeviceAdapter getSenderDeviceAdapterTarget()
   {
      if (adaptedClass.getSender().getResource() instanceof org.hl7.fhir.dstu3.model.Device)
      {
         qicoredeviceAdapter profiledType = new qicoredeviceAdapter();
         profiledType
               .setAdaptee((org.hl7.fhir.dstu3.model.Device) adaptedClass
                     .getSender().getResource());
         return profiledType;
      }
      else
      {
         return null;
      }
   }

   public Iqicorecommunicationrequest setSenderAdapterTarget(
         qicoredeviceAdapter param)
   {
      adaptedClass.setSenderTarget(param.getAdaptee());
      return this;
   }

   public Reference getSenderRelatedPerson()
   {
      try
      {
         return adaptedClass.getSender();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Sender", e);
      }
   }

   public RelatedPerson getSenderRelatedPersonTarget()
   {
      return (org.hl7.fhir.dstu3.model.RelatedPerson) adaptedClass
            .getSenderTarget();
   }

   public Iqicorecommunicationrequest setSenderTarget(RelatedPerson param)
   {
      adaptedClass.setSenderTarget(param);
      return this;
   }

   public qicorerelatedpersonAdapter getSenderRelatedPersonAdapterTarget()
   {
      if (adaptedClass.getSender().getResource() instanceof org.hl7.fhir.dstu3.model.RelatedPerson)
      {
         qicorerelatedpersonAdapter profiledType = new qicorerelatedpersonAdapter();
         profiledType
               .setAdaptee((org.hl7.fhir.dstu3.model.RelatedPerson) adaptedClass
                     .getSender().getResource());
         return profiledType;
      }
      else
      {
         return null;
      }
   }

   public Iqicorecommunicationrequest setSenderAdapterTarget(
         qicorerelatedpersonAdapter param)
   {
      adaptedClass.setSenderTarget(param.getAdaptee());
      return this;
   }

   public Reference getSenderOrganization()
   {
      try
      {
         return adaptedClass.getSender();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Sender", e);
      }
   }

   public Organization getSenderOrganizationTarget()
   {
      return (org.hl7.fhir.dstu3.model.Organization) adaptedClass
            .getSenderTarget();
   }

   public Iqicorecommunicationrequest setSenderTarget(Organization param)
   {
      adaptedClass.setSenderTarget(param);
      return this;
   }

   public qicoreorganizationAdapter getSenderOrganizationAdapterTarget()
   {
      if (adaptedClass.getSender().getResource() instanceof org.hl7.fhir.dstu3.model.Organization)
      {
         qicoreorganizationAdapter profiledType = new qicoreorganizationAdapter();
         profiledType
               .setAdaptee((org.hl7.fhir.dstu3.model.Organization) adaptedClass
                     .getSender().getResource());
         return profiledType;
      }
      else
      {
         return null;
      }
   }

   public Iqicorecommunicationrequest setSenderAdapterTarget(
         qicoreorganizationAdapter param)
   {
      adaptedClass.setSenderTarget(param.getAdaptee());
      return this;
   }

   public Type getOccurrence()
   {
      try
      {
         return adaptedClass.getOccurrence();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Occurrence", e);
      }
   }

   public Iqicorecommunicationrequest setOccurrence(Type param)
   {
      adaptedClass.setOccurrence(param);
      return this;
   }

   public DateTimeType getOccurrenceDateTimeType()
   {
      try
      {
         return adaptedClass.getOccurrenceDateTimeType();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting OccurrenceDateTimeType", e);
      }
   }

   public boolean hasOccurrenceDateTimeType()
   {
      return adaptedClass.hasOccurrenceDateTimeType();
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

   public boolean hasOccurrencePeriod()
   {
      return adaptedClass.hasOccurrencePeriod();
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

   public Iqicorecommunicationrequest setIdElement(IdType param)
   {
      adaptedClass.setIdElement(param);
      return this;
   }

   public Iqicorecommunicationrequest setId(String param)
   {
      adaptedClass.setId(param);
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
         throw new RuntimeException("Error getting Reason", e);
      }
   }

   public Iqicorecommunicationrequest setReasonCode(List<CodeableConcept> param)
   {
      adaptedClass.setReasonCode(param);
      return this;
   }

   public boolean hasReasonCode()
   {
      return adaptedClass.hasReasonCode();
   }

   public Iqicorecommunicationrequest addReasonCode(CodeableConcept param)
   {
      adaptedClass.addReasonCode(param);
      return this;
   }

   public CodeableConcept addReason()
   {
      return adaptedClass.addReasonCode();
   }
}
