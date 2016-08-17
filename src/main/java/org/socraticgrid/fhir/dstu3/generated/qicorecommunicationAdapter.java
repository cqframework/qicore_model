package org.socraticgrid.fhir.dstu3.generated;

import org.socraticgrid.fhir.dstu3.generated.Iqicorecommunication;
import org.hl7.fhir.dstu3.model.Communication;
import org.hl7.fhir.dstu3.model.Reference;
import org.hl7.fhir.dstu3.model.Encounter;
import org.hl7.fhir.dstu3.model.UriType;
import java.lang.String;
import java.util.List;
import org.hl7.fhir.dstu3.model.CodeableConcept;
import org.hl7.fhir.dstu3.model.Annotation;
import org.hl7.fhir.dstu3.model.Patient;
import org.hl7.fhir.dstu3.model.Resource;
import org.hl7.fhir.dstu3.model.Enumeration;
import org.hl7.fhir.dstu3.model.IdType;
import org.hl7.fhir.dstu3.model.CodeType;
import org.hl7.fhir.dstu3.model.Practitioner;
import org.hl7.fhir.dstu3.model.Device;
import org.hl7.fhir.dstu3.model.RelatedPerson;
import org.hl7.fhir.dstu3.model.Organization;
import org.hl7.fhir.dstu3.model.Identifier;
import org.socraticgrid.fhir.dstu3.generated.qicoredeviceAdapter;
import org.socraticgrid.fhir.dstu3.generated.qicoreorganizationAdapter;
import org.socraticgrid.fhir.dstu3.generated.qicorepatientAdapter;
import org.socraticgrid.fhir.dstu3.generated.qicorepractitionerAdapter;
import org.socraticgrid.fhir.dstu3.generated.qicorerelatedpersonAdapter;
import org.hl7.fhir.dstu3.model.*;
import ca.uhn.fhir.model.api.ExtensionDt;

public class qicorecommunicationAdapter implements Iqicorecommunication
{

   private Communication adaptedClass;

   public qicorecommunicationAdapter()
   {
      this.adaptedClass = new org.hl7.fhir.dstu3.model.Communication();
   }

   public qicorecommunicationAdapter(Communication adaptee)
   {
      this.adaptedClass = adaptee;
   }

   public Communication getAdaptee()
   {
      return adaptedClass;
   }

   public void setAdaptee(Communication param)
   {
      this.adaptedClass = param;
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

   public Iqicorecommunication setContext(Reference param)
   {
      adaptedClass.setContext(param);
      return this;
   }

   public Encounter getContextTarget()
   {
      return (org.hl7.fhir.dstu3.model.Encounter) adaptedClass
            .getContextTarget();
   }

   public Iqicorecommunication setContextTarget(Encounter param)
   {
      adaptedClass.setContextTarget(param);
      return this;
   }

   public qicoreencounterAdapter getContextAdapterTarget()
   {
      if (adaptedClass.getContext().getResource() instanceof org.hl7.fhir.dstu3.model.Encounter)
      {
         org.socraticgrid.fhir.dstu3.generated.qicoreencounterAdapter profiledType = new org.socraticgrid.fhir.dstu3.generated.qicoreencounterAdapter();
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

   public Iqicorecommunication setContextAdapterTarget(
         qicoreencounterAdapter param)
   {
      adaptedClass.setContextTarget(param.getAdaptee());
      return this;
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

   public Iqicorecommunication setImplicitRulesElement(UriType param)
   {
      adaptedClass.setImplicitRulesElement(param);
      return this;
   }

   public Iqicorecommunication setImplicitRules(String param)
   {
      adaptedClass.setImplicitRules(param);
      return this;
   }

   public List<Communication.CommunicationPayloadComponent> getPayload()
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

   public qicorecommunicationAdapter setPayload(
         List<Communication.CommunicationPayloadComponent> param)
   {
      adaptedClass.setPayload(param);
      return this;
   }

   public boolean hasPayload()
   {
      return adaptedClass.hasPayload();
   }

   public qicorecommunicationAdapter addPayload(
         Communication.CommunicationPayloadComponent param)
   {
      adaptedClass.addPayload(param);
      return this;
   }

   public Communication.CommunicationPayloadComponent addPayload()
   {
      return adaptedClass.addPayload();
   }

   public List<CodeableConcept> getReason()
   {
      try
      {
         return adaptedClass.getReason();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Reason", e);
      }
   }

   public Iqicorecommunication setReason(List<CodeableConcept> param)
   {
      adaptedClass.setReason(param);
      return this;
   }

   public boolean hasReason()
   {
      return adaptedClass.hasReason();
   }

   public Iqicorecommunication addReason(CodeableConcept param)
   {
      adaptedClass.addReason(param);
      return this;
   }

   public CodeableConcept addReason()
   {
      return adaptedClass.addReason();
   }

   public List<Annotation> getNote()
   {
      try
      {
         return adaptedClass.getNote();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Note", e);
      }
   }

   public Iqicorecommunication setNote(List<Annotation> param)
   {
      adaptedClass.setNote(param);
      return this;
   }

   public boolean hasNote()
   {
      return adaptedClass.hasNote();
   }

   public Iqicorecommunication addNote(Annotation param)
   {
      adaptedClass.addNote(param);
      return this;
   }

   public Annotation addNote()
   {
      return adaptedClass.addNote();
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

   public Iqicorecommunication setSubject(Reference param)
   {
      adaptedClass.setSubject(param);
      return this;
   }

   public Patient getSubjectTarget()
   {
      return (org.hl7.fhir.dstu3.model.Patient) adaptedClass
            .getSubjectTarget();
   }

   public Iqicorecommunication setSubjectTarget(Patient param)
   {
      adaptedClass.setSubjectTarget(param);
      return this;
   }

   public qicorepatientAdapter getSubjectAdapterTarget()
   {
      if (adaptedClass.getSubject().getResource() instanceof org.hl7.fhir.dstu3.model.Patient)
      {
         org.socraticgrid.fhir.dstu3.generated.qicorepatientAdapter profiledType = new org.socraticgrid.fhir.dstu3.generated.qicorepatientAdapter();
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

   public Iqicorecommunication setSubjectAdapterTarget(
         qicorepatientAdapter param)
   {
      adaptedClass.setSubjectTarget(param.getAdaptee());
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

   public Iqicorecommunication setContained(List<Resource> param)
   {
      adaptedClass.setContained(param);
      return this;
   }

   public boolean hasContained()
   {
      return adaptedClass.hasContained();
   }

   public Iqicorecommunication addContained(Resource param)
   {
      adaptedClass.addContained(param);
      return this;
   }

   public boolean hasParent()
   {
      return adaptedClass.hasParent();
   }

   public List<Reference> getParent()
   {
      return adaptedClass.getParent();
   }

   public CodeableConcept getReasonNotPerformed()
   {
      List<org.hl7.fhir.dstu3.model.Extension> extensions = adaptedClass
            .getExtensionsByUrl("http://hl7.org/fhir/StructureDefinition/communication-reasonNotPerformed");
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
               "More than one extension exists for reasonNotPerformed");
      }
   }

   public Iqicorecommunication setReasonNotPerformed(CodeableConcept param)
   {
      adaptedClass
            .addExtension()
            .setUrl("http://hl7.org/fhir/StructureDefinition/communication-reasonNotPerformed")
            .setValue(param);
      return this;
   }

   public boolean hasTopic()
   {
      return adaptedClass.hasTopic();
   }

   public List<Reference> getTopic()
   {
      return adaptedClass.getTopic();
   }

   public boolean hasStatus()
   {
      return adaptedClass.hasStatus();
   }

   public boolean hasStatusElement()
   {
      return adaptedClass.hasStatusElement();
   }

   public Communication.CommunicationStatus getStatus()
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

   public Enumeration<Communication.CommunicationStatus> getStatusElement()
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

   public Iqicorecommunication setStatus(
         Communication.CommunicationStatus param)
   {
      adaptedClass.setStatus(param);
      return this;
   }

   public Iqicorecommunication setStatusElement(
         Enumeration<Communication.CommunicationStatus> param)
   {
      adaptedClass.setStatusElement(param);
      return this;
   }

   public CodeableConcept getCategory()
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

   public Iqicorecommunication setCategory(CodeableConcept param)
   {
      adaptedClass.setCategory(param);
      return this;
   }

   public boolean hasCategory()
   {
      return adaptedClass.hasCategory();
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

   public Iqicorecommunication setMedium(List<CodeableConcept> param)
   {
      adaptedClass.setMedium(param);
      return this;
   }

   public boolean hasMedium()
   {
      return adaptedClass.hasMedium();
   }

   public Iqicorecommunication addMedium(CodeableConcept param)
   {
      adaptedClass.addMedium(param);
      return this;
   }

   public CodeableConcept addMedium()
   {
      return adaptedClass.addMedium();
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

   public Iqicorecommunication setIdElement(IdType param)
   {
      adaptedClass.setIdElement(param);
      return this;
   }

   public Iqicorecommunication setId(String param)
   {
      adaptedClass.setId(param);
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

   public Iqicorecommunication setLanguageElement(CodeType param)
   {
      adaptedClass.setLanguageElement(param);
      return this;
   }

   public Iqicorecommunication setLanguage(String param)
   {
      adaptedClass.setLanguage(param);
      return this;
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

   public Iqicorecommunication setSender(Reference param)
   {
      adaptedClass.setSender(param);
      return this;
   }

   public Practitioner getSenderPractitionerTarget()
   {
      return (org.hl7.fhir.dstu3.model.Practitioner) adaptedClass
            .getSenderTarget();
   }

   public Iqicorecommunication setSenderTarget(Practitioner param)
   {
      adaptedClass.setSenderTarget(param);
      return this;
   }

   public qicorepractitionerAdapter getSenderPractitionerAdapterTarget()
   {
      if (adaptedClass.getSender().getResource() instanceof org.hl7.fhir.dstu3.model.Practitioner)
      {
         org.socraticgrid.fhir.dstu3.generated.qicorepractitionerAdapter profiledType = new org.socraticgrid.fhir.dstu3.generated.qicorepractitionerAdapter();
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

   public Iqicorecommunication setSenderAdapterTarget(
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

   public Iqicorecommunication setSenderTarget(Patient param)
   {
      adaptedClass.setSenderTarget(param);
      return this;
   }

   public qicorepatientAdapter getSenderPatientAdapterTarget()
   {
      if (adaptedClass.getSender().getResource() instanceof org.hl7.fhir.dstu3.model.Patient)
      {
         org.socraticgrid.fhir.dstu3.generated.qicorepatientAdapter profiledType = new org.socraticgrid.fhir.dstu3.generated.qicorepatientAdapter();
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

   public Iqicorecommunication setSenderAdapterTarget(
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

   public Iqicorecommunication setSenderTarget(Device param)
   {
      adaptedClass.setSenderTarget(param);
      return this;
   }

   public qicoredeviceAdapter getSenderDeviceAdapterTarget()
   {
      if (adaptedClass.getSender().getResource() instanceof org.hl7.fhir.dstu3.model.Device)
      {
         org.socraticgrid.fhir.dstu3.generated.qicoredeviceAdapter profiledType = new org.socraticgrid.fhir.dstu3.generated.qicoredeviceAdapter();
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

   public Iqicorecommunication setSenderAdapterTarget(qicoredeviceAdapter param)
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

   public Iqicorecommunication setSenderTarget(RelatedPerson param)
   {
      adaptedClass.setSenderTarget(param);
      return this;
   }

   public qicorerelatedpersonAdapter getSenderRelatedPersonAdapterTarget()
   {
      if (adaptedClass.getSender().getResource() instanceof org.hl7.fhir.dstu3.model.RelatedPerson)
      {
         org.socraticgrid.fhir.dstu3.generated.qicorerelatedpersonAdapter profiledType = new org.socraticgrid.fhir.dstu3.generated.qicorerelatedpersonAdapter();
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

   public Iqicorecommunication setSenderAdapterTarget(
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

   public Iqicorecommunication setSenderTarget(Organization param)
   {
      adaptedClass.setSenderTarget(param);
      return this;
   }

   public qicoreorganizationAdapter getSenderOrganizationAdapterTarget()
   {
      if (adaptedClass.getSender().getResource() instanceof org.hl7.fhir.dstu3.model.Organization)
      {
         org.socraticgrid.fhir.dstu3.generated.qicoreorganizationAdapter profiledType = new org.socraticgrid.fhir.dstu3.generated.qicoreorganizationAdapter();
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

   public Iqicorecommunication setSenderAdapterTarget(
         qicoreorganizationAdapter param)
   {
      adaptedClass.setSenderTarget(param.getAdaptee());
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

   public Iqicorecommunication setIdentifier(List<Identifier> param)
   {
      adaptedClass.setIdentifier(param);
      return this;
   }

   public boolean hasIdentifier()
   {
      return adaptedClass.hasIdentifier();
   }

   public Iqicorecommunication addIdentifier(Identifier param)
   {
      adaptedClass.addIdentifier(param);
      return this;
   }

   public Identifier addIdentifier()
   {
      return adaptedClass.addIdentifier();
   }

   public boolean hasRecipient()
   {
      return adaptedClass.hasRecipient();
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

   public List<Patient> getRecipientPatientTarget() {
		List<org.hl7.fhir.dstu3.model.Patient> items = new java.util.ArrayList<>();
		List<org.hl7.fhir.dstu3.model.Resource> resources = adaptedClass
				.getRecipientTarget();
		for (org.hl7.fhir.dstu3.model.Resource resource : resources) {
			items.add((org.hl7.fhir.dstu3.model.Patient) resource);
		}
		return items;
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

   public List<RelatedPerson> getRecipientRelatedPersonTarget() {
		List<org.hl7.fhir.dstu3.model.RelatedPerson> items = new java.util.ArrayList<>();
		List<org.hl7.fhir.dstu3.model.Resource> resources = adaptedClass
				.getRecipientTarget();
		for (org.hl7.fhir.dstu3.model.Resource resource : resources) {
			items.add((org.hl7.fhir.dstu3.model.RelatedPerson) resource);
		}
		return items;
	}

   public List<Group> getRecipientGroupTarget() {
		List<org.hl7.fhir.dstu3.model.Group> items = new java.util.ArrayList<>();
		List<org.hl7.fhir.dstu3.model.Resource> resources = adaptedClass
				.getRecipientTarget();
		for (org.hl7.fhir.dstu3.model.Resource resource : resources) {
			items.add((org.hl7.fhir.dstu3.model.Group) resource);
		}
		return items;
	}

   public boolean hasBasedOn()
   {
      return adaptedClass.hasBasedOn();
   }

   public List<Reference> getBasedOn()
   {
      return adaptedClass.getBasedOn();
   }
}