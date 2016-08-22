package org.cqf.qicore.dstu3;

import org.hl7.fhir.dstu3.model.DiagnosticRequest;
import org.hl7.fhir.dstu3.model.CodeableConcept;
import org.hl7.fhir.dstu3.model.Reference;
import org.hl7.fhir.dstu3.model.Resource;
import org.hl7.fhir.dstu3.model.Patient;
import org.hl7.fhir.dstu3.model.Group;
import org.hl7.fhir.dstu3.model.Location;
import org.hl7.fhir.dstu3.model.Device;
import org.hl7.fhir.dstu3.model.Annotation;
import java.util.List;
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
import org.hl7.fhir.dstu3.model.*;

public class qicorediagnosticrequestAdapter implements Iqicorediagnosticrequest
{

   private DiagnosticRequest adaptedClass;

   public qicorediagnosticrequestAdapter()
   {
      this.adaptedClass = new org.hl7.fhir.dstu3.model.DiagnosticRequest();
   }

   public qicorediagnosticrequestAdapter(DiagnosticRequest adaptee)
   {
      this.adaptedClass = adaptee;
   }

   public DiagnosticRequest getAdaptee()
   {
      return adaptedClass;
   }

   public void setAdaptee(DiagnosticRequest param)
   {
      this.adaptedClass = param;
   }

   public CodeableConcept getPerformerType()
   {
      try
      {
         return adaptedClass.getPerformerType();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting PerformerType", e);
      }
   }

   public Iqicorediagnosticrequest setPerformerType(CodeableConcept param)
   {
      adaptedClass.setPerformerType(param);
      return this;
   }

   public boolean hasPerformerType()
   {
      return adaptedClass.hasPerformerType();
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

   public Resource getSubjectTarget()
   {
      try
      {
         return adaptedClass.getSubjectTarget();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting SubjectTarget", e);
      }
   }

   public boolean hasSubject()
   {
      return adaptedClass.hasSubject();
   }

   public Reference getSubjectPatient()
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

   public Iqicorediagnosticrequest setSubject(Reference param)
   {
      adaptedClass.setSubject(param);
      return this;
   }

   public Patient getSubjectPatientTarget()
   {
      return (org.hl7.fhir.dstu3.model.Patient) adaptedClass
            .getSubjectTarget();
   }

   public Iqicorediagnosticrequest setSubjectTarget(Patient param)
   {
      adaptedClass.setSubjectTarget(param);
      return this;
   }

   public qicorepatientAdapter getSubjectPatientAdapterTarget()
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

   public Iqicorediagnosticrequest setSubjectAdapterTarget(
         qicorepatientAdapter param)
   {
      adaptedClass.setSubjectTarget(param.getAdaptee());
      return this;
   }

   public Reference getSubjectGroup()
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

   public Group getSubjectGroupTarget()
   {
      return (org.hl7.fhir.dstu3.model.Group) adaptedClass.getSubjectTarget();
   }

   public Iqicorediagnosticrequest setSubjectTarget(Group param)
   {
      adaptedClass.setSubjectTarget(param);
      return this;
   }

   public Reference getSubjectLocation()
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

   public Location getSubjectLocationTarget()
   {
      return (org.hl7.fhir.dstu3.model.Location) adaptedClass
            .getSubjectTarget();
   }

   public Iqicorediagnosticrequest setSubjectTarget(Location param)
   {
      adaptedClass.setSubjectTarget(param);
      return this;
   }

   public qicorelocationAdapter getSubjectLocationAdapterTarget()
   {
      if (adaptedClass.getSubject().getResource() instanceof org.hl7.fhir.dstu3.model.Location)
      {
         qicorelocationAdapter profiledType = new qicorelocationAdapter();
         profiledType
               .setAdaptee((org.hl7.fhir.dstu3.model.Location) adaptedClass
                     .getSubject().getResource());
         return profiledType;
      }
      else
      {
         return null;
      }
   }

   public Iqicorediagnosticrequest setSubjectAdapterTarget(
         qicorelocationAdapter param)
   {
      adaptedClass.setSubjectTarget(param.getAdaptee());
      return this;
   }

   public Reference getSubjectDevice()
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

   public Device getSubjectDeviceTarget()
   {
      return (org.hl7.fhir.dstu3.model.Device) adaptedClass
            .getSubjectTarget();
   }

   public Iqicorediagnosticrequest setSubjectTarget(Device param)
   {
      adaptedClass.setSubjectTarget(param);
      return this;
   }

   public qicoredeviceAdapter getSubjectDeviceAdapterTarget()
   {
      if (adaptedClass.getSubject().getResource() instanceof org.hl7.fhir.dstu3.model.Device)
      {
         qicoredeviceAdapter profiledType = new qicoredeviceAdapter();
         profiledType
               .setAdaptee((org.hl7.fhir.dstu3.model.Device) adaptedClass
                     .getSubject().getResource());
         return profiledType;
      }
      else
      {
         return null;
      }
   }

   public Iqicorediagnosticrequest setSubjectAdapterTarget(
         qicoredeviceAdapter param)
   {
      adaptedClass.setSubjectTarget(param.getAdaptee());
      return this;
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

   public Iqicorediagnosticrequest setNote(List<Annotation> param)
   {
      adaptedClass.setNote(param);
      return this;
   }

   public boolean hasNote()
   {
      return adaptedClass.hasNote();
   }

   public Iqicorediagnosticrequest addNote(Annotation param)
   {
      adaptedClass.addNote(param);
      return this;
   }

   public Annotation addNote()
   {
      return adaptedClass.addNote();
   }

   public CodeableConcept getCode()
   {
      try
      {
         return adaptedClass.getCode();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Code", e);
      }
   }

   public Iqicorediagnosticrequest setCode(CodeableConcept param)
   {
      adaptedClass.setCode(param);
      return this;
   }

   public boolean hasCode()
   {
      return adaptedClass.hasCode();
   }

   public boolean hasRelevantHistory()
   {
      return adaptedClass.hasRelevantHistory();
   }

   public List<Reference> getRelevantHistory()
   {
      return adaptedClass.getRelevantHistory();
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

   public Iqicorediagnosticrequest setReason(List<CodeableConcept> param)
   {
      adaptedClass.setReason(param);
      return this;
   }

   public boolean hasReason()
   {
      return adaptedClass.hasReason();
   }

   public Iqicorediagnosticrequest addReason(CodeableConcept param)
   {
      adaptedClass.addReason(param);
      return this;
   }

   public CodeableConcept addReason()
   {
      return adaptedClass.addReason();
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

   public Iqicorediagnosticrequest setIdElement(IdType param)
   {
      adaptedClass.setIdElement(param);
      return this;
   }

   public Iqicorediagnosticrequest setId(String param)
   {
      adaptedClass.setId(param);
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

   public Iqicorediagnosticrequest setContext(Reference param)
   {
      adaptedClass.setContext(param);
      return this;
   }

   public Encounter getContextTarget()
   {
      return (org.hl7.fhir.dstu3.model.Encounter) adaptedClass
            .getContextTarget();
   }

   public Iqicorediagnosticrequest setContextTarget(Encounter param)
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

   public Iqicorediagnosticrequest setContextAdapterTarget(
         qicoreencounterAdapter param)
   {
      adaptedClass.setContextTarget(param.getAdaptee());
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

   public Iqicorediagnosticrequest setIdentifier(List<Identifier> param)
   {
      adaptedClass.setIdentifier(param);
      return this;
   }

   public boolean hasIdentifier()
   {
      return adaptedClass.hasIdentifier();
   }

   public Iqicorediagnosticrequest addIdentifier(Identifier param)
   {
      adaptedClass.addIdentifier(param);
      return this;
   }

   public Identifier addIdentifier()
   {
      return adaptedClass.addIdentifier();
   }

   public Reference getPerformer()
   {
      try
      {
         return adaptedClass.getPerformer();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Performer", e);
      }
   }

   public Resource getPerformerTarget()
   {
      try
      {
         return adaptedClass.getPerformerTarget();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting PerformerTarget", e);
      }
   }

   public boolean hasPerformer()
   {
      return adaptedClass.hasPerformer();
   }

   public Reference getPerformerPractitioner()
   {
      try
      {
         return adaptedClass.getPerformer();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Performer", e);
      }
   }

   public Iqicorediagnosticrequest setPerformer(Reference param)
   {
      adaptedClass.setPerformer(param);
      return this;
   }

   public Practitioner getPerformerPractitionerTarget()
   {
      return (org.hl7.fhir.dstu3.model.Practitioner) adaptedClass
            .getPerformerTarget();
   }

   public Iqicorediagnosticrequest setPerformerTarget(Practitioner param)
   {
      adaptedClass.setPerformerTarget(param);
      return this;
   }

   public Reference getPerformerOrganization()
   {
      try
      {
         return adaptedClass.getPerformer();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Performer", e);
      }
   }

   public Organization getPerformerOrganizationTarget()
   {
      return (org.hl7.fhir.dstu3.model.Organization) adaptedClass
            .getPerformerTarget();
   }

   public Iqicorediagnosticrequest setPerformerTarget(Organization param)
   {
      adaptedClass.setPerformerTarget(param);
      return this;
   }

   public Reference getPerformerPatient()
   {
      try
      {
         return adaptedClass.getPerformer();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Performer", e);
      }
   }

   public Patient getPerformerPatientTarget()
   {
      return (org.hl7.fhir.dstu3.model.Patient) adaptedClass
            .getPerformerTarget();
   }

   public Iqicorediagnosticrequest setPerformerTarget(Patient param)
   {
      adaptedClass.setPerformerTarget(param);
      return this;
   }

   public Reference getPerformerDevice()
   {
      try
      {
         return adaptedClass.getPerformer();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Performer", e);
      }
   }

   public Device getPerformerDeviceTarget()
   {
      return (org.hl7.fhir.dstu3.model.Device) adaptedClass
            .getPerformerTarget();
   }

   public Iqicorediagnosticrequest setPerformerTarget(Device param)
   {
      adaptedClass.setPerformerTarget(param);
      return this;
   }

   public Reference getPerformerRelatedPerson()
   {
      try
      {
         return adaptedClass.getPerformer();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Performer", e);
      }
   }

   public RelatedPerson getPerformerRelatedPersonTarget()
   {
      return (org.hl7.fhir.dstu3.model.RelatedPerson) adaptedClass
            .getPerformerTarget();
   }

   public Iqicorediagnosticrequest setPerformerTarget(RelatedPerson param)
   {
      adaptedClass.setPerformerTarget(param);
      return this;
   }

   public CodeableConcept getStage()
   {
      try
      {
         return adaptedClass.getStage();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Stage", e);
      }
   }

   public Iqicorediagnosticrequest setStage(CodeableConcept param)
   {
      adaptedClass.setStage(param);
      return this;
   }

   public boolean hasStage()
   {
      return adaptedClass.hasStage();
   }

   public Identifier getRequisition()
   {
      try
      {
         return adaptedClass.getRequisition();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Requisition", e);
      }
   }

   public Iqicorediagnosticrequest setRequisition(Identifier param)
   {
      adaptedClass.setRequisition(param);
      return this;
   }

   public boolean hasRequisition()
   {
      return adaptedClass.hasRequisition();
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

   public Iqicorediagnosticrequest setLanguageElement(CodeType param)
   {
      adaptedClass.setLanguageElement(param);
      return this;
   }

   public Iqicorediagnosticrequest setLanguage(String param)
   {
      adaptedClass.setLanguage(param);
      return this;
   }

   public boolean hasRequester()
   {
      return adaptedClass.hasRequester();
   }

   public Reference getRequester()
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

   public Iqicorediagnosticrequest setRequester(Reference param)
   {
      adaptedClass.setRequester(param);
      return this;
   }

   public Practitioner getRequesterTarget()
   {
      return (org.hl7.fhir.dstu3.model.Practitioner) adaptedClass
            .getRequesterTarget();
   }

   public Iqicorediagnosticrequest setRequesterTarget(Practitioner param)
   {
      adaptedClass.setRequesterTarget(param);
      return this;
   }

   public qicorepractitionerAdapter getRequesterAdapterTarget()
   {
      if (adaptedClass.getRequester().getResource() instanceof org.hl7.fhir.dstu3.model.Practitioner)
      {
         qicorepractitionerAdapter profiledType = new qicorepractitionerAdapter();
         profiledType
               .setAdaptee((org.hl7.fhir.dstu3.model.Practitioner) adaptedClass
                     .getRequester().getResource());
         return profiledType;
      }
      else
      {
         return null;
      }
   }

   public Iqicorediagnosticrequest setRequesterAdapterTarget(
         qicorepractitionerAdapter param)
   {
      adaptedClass.setRequesterTarget(param.getAdaptee());
      return this;
   }

   public boolean hasReplaces()
   {
      return adaptedClass.hasReplaces();
   }

   public List<Reference> getReplaces()
   {
      return adaptedClass.getReplaces();
   }

   public boolean hasBasedOn()
   {
      return adaptedClass.hasBasedOn();
   }

   public List<Reference> getBasedOn()
   {
      return adaptedClass.getBasedOn();
   }

   public boolean hasDefinition()
   {
      return adaptedClass.hasDefinition();
   }

   public List<Reference> getDefinition()
   {
      return adaptedClass.getDefinition();
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

   public Iqicorediagnosticrequest setOccurrence(Type param)
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
         throw new RuntimeException("Error getting OccurrenceDateTimeType",
               e);
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

   public Timing getOccurrenceTiming()
   {
      try
      {
         return adaptedClass.getOccurrenceTiming();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting OccurrenceTiming", e);
      }
   }

   public boolean hasOccurrenceTiming()
   {
      return adaptedClass.hasOccurrenceTiming();
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

   public Iqicorediagnosticrequest setImplicitRulesElement(UriType param)
   {
      adaptedClass.setImplicitRulesElement(param);
      return this;
   }

   public Iqicorediagnosticrequest setImplicitRules(String param)
   {
      adaptedClass.setImplicitRules(param);
      return this;
   }

   public boolean hasSupportingInformation()
   {
      return adaptedClass.hasSupportingInformation();
   }

   public List<Observation> getSupportingInformationObservationTarget() {
		List<org.hl7.fhir.dstu3.model.Observation> items = new java.util.ArrayList<>();
		List<org.hl7.fhir.dstu3.model.Resource> resources = adaptedClass
				.getSupportingInformationTarget();
		for (org.hl7.fhir.dstu3.model.Resource resource : resources) {
			items.add((org.hl7.fhir.dstu3.model.Observation) resource);
		}
		return items;
	}

   public List<Reference> getSupportingInformation()
   {
      return adaptedClass.getSupportingInformation();
   }

   public List<Condition> getSupportingInformationConditionTarget() {
		List<org.hl7.fhir.dstu3.model.Condition> items = new java.util.ArrayList<>();
		List<org.hl7.fhir.dstu3.model.Resource> resources = adaptedClass
				.getSupportingInformationTarget();
		for (org.hl7.fhir.dstu3.model.Resource resource : resources) {
			items.add((org.hl7.fhir.dstu3.model.Condition) resource);
		}
		return items;
	}

   public List<DocumentReference> getSupportingInformationDocumentReferenceTarget() {
		List<org.hl7.fhir.dstu3.model.DocumentReference> items = new java.util.ArrayList<>();
		List<org.hl7.fhir.dstu3.model.Resource> resources = adaptedClass
				.getSupportingInformationTarget();
		for (org.hl7.fhir.dstu3.model.Resource resource : resources) {
			items.add((org.hl7.fhir.dstu3.model.DocumentReference) resource);
		}
		return items;
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

   public Iqicorediagnosticrequest setContained(List<Resource> param)
   {
      adaptedClass.setContained(param);
      return this;
   }

   public boolean hasContained()
   {
      return adaptedClass.hasContained();
   }

   public Iqicorediagnosticrequest addContained(Resource param)
   {
      adaptedClass.addContained(param);
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

   public DiagnosticRequest.DiagnosticRequestStatus getStatus()
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

   public Enumeration<DiagnosticRequest.DiagnosticRequestStatus> getStatusElement()
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

   public Iqicorediagnosticrequest setStatus(
         DiagnosticRequest.DiagnosticRequestStatus param)
   {
      adaptedClass.setStatus(param);
      return this;
   }

   public Iqicorediagnosticrequest setStatusElement(
         Enumeration<DiagnosticRequest.DiagnosticRequestStatus> param)
   {
      adaptedClass.setStatusElement(param);
      return this;
   }
}