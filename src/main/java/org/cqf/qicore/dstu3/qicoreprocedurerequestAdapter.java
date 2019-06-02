package org.cqf.qicore.dstu3;

import org.hl7.fhir.dstu3.model.ProcedureRequest;
import org.hl7.fhir.dstu3.model.Annotation;

import java.util.ArrayList;
import java.util.List;
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

public class qicoreprocedurerequestAdapter implements Iqicoreprocedurerequest
{

   private ProcedureRequest adaptedClass;

   public qicoreprocedurerequestAdapter()
   {
      this.adaptedClass = new org.hl7.fhir.dstu3.model.ProcedureRequest();
   }

   public qicoreprocedurerequestAdapter(ProcedureRequest adaptee)
   {
      this.adaptedClass = adaptee;
   }

   public ProcedureRequest getAdaptee()
   {
      return adaptedClass;
   }

   public void setAdaptee(ProcedureRequest param)
   {
      this.adaptedClass = param;
   }

   public List<Annotation> getNotes()
   {
      try
      {
         return adaptedClass.getNote();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Notes", e);
      }
   }

   public Iqicoreprocedurerequest setNotes(List<Annotation> param)
   {
      adaptedClass.setNote(param);
      return this;
   }

   public boolean hasNotes()
   {
      return adaptedClass.hasNote();
   }

   public Iqicoreprocedurerequest addNotes(Annotation param)
   {
      adaptedClass.addNote(param);
      return this;
   }

   public Annotation addNotes()
   {
      return adaptedClass.addNote();
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

   public Iqicoreprocedurerequest setIdElement(IdType param)
   {
      adaptedClass.setIdElement(param);
      return this;
   }

   public Iqicoreprocedurerequest setId(String param)
   {
      adaptedClass.setId(param);
      return this;
   }

   public CodeableConcept getReasonRefused()
   {
      List<org.hl7.fhir.dstu3.model.Extension> extensions = adaptedClass
            .getExtensionsByUrl("http://hl7.org/fhir/StructureDefinition/procedurerequest-reasonRefused");
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
               "More than one extension exists for reasonRefused");
      }
   }

   public Iqicoreprocedurerequest setReasonRefused(CodeableConcept param)
   {
      adaptedClass
            .addExtension()
            .setUrl("http://hl7.org/fhir/StructureDefinition/procedurerequest-reasonRefused")
            .setValue(param);
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

   public Iqicoreprocedurerequest setImplicitRulesElement(UriType param)
   {
      adaptedClass.setImplicitRulesElement(param);
      return this;
   }

   public Iqicoreprocedurerequest setImplicitRules(String param)
   {
      adaptedClass.setImplicitRules(param);
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

   public Iqicoreprocedurerequest setLanguageElement(CodeType param)
   {
      adaptedClass.setLanguageElement(param);
      return this;
   }

   public Iqicoreprocedurerequest setLanguage(String param)
   {
      adaptedClass.setLanguage(param);
      return this;
   }

   public boolean hasPriority()
   {
      return adaptedClass.hasPriority();
   }

   public boolean hasPriorityElement()
   {
      return adaptedClass.hasPriorityElement();
   }

   public ProcedureRequest.ProcedureRequestPriority getPriority()
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

   public Enumeration<ProcedureRequest.ProcedureRequestPriority> getPriorityElement()
   {
      try
      {
         return adaptedClass.getPriorityElement();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting PriorityElement", e);
      }
   }

   public Iqicoreprocedurerequest setPriority(
         ProcedureRequest.ProcedureRequestPriority param)
   {
      adaptedClass.setPriority(param);
      return this;
   }

   public Iqicoreprocedurerequest setPriorityElement(
         Enumeration<ProcedureRequest.ProcedureRequestPriority> param)
   {
      adaptedClass.setPriorityElement(param);
      return this;
   }

   public ProcedureRequest.ProcedureRequestRequesterComponent getRequester()
   {
      try
      {
         return adaptedClass.getRequester();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Orderer", e);
      }
   }

   public boolean hasRequester()
   {
      return adaptedClass.hasRequester();
   }

   public ProcedureRequest.ProcedureRequestRequesterComponent geRequesterPractitioner()
   {
      try
      {
         return adaptedClass.getRequester();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Orderer", e);
      }
   }

   public Iqicoreprocedurerequest setOrderer(ProcedureRequest.ProcedureRequestRequesterComponent param)
   {
      adaptedClass.setRequester(param);
      return this;
   }

   public Practitioner getRequesterAgentTarget()
   {
      return (org.hl7.fhir.dstu3.model.Practitioner) adaptedClass.getRequester().getAgentTarget();
   }

   public Iqicoreprocedurerequest setRequesterAgentTarget(Resource param)
   {
      adaptedClass.getRequester().setAgentTarget(param);
      return this;
   }

   public qicorepractitionerAdapter getRequesterPractitionerAdapterTarget()
   {
      if (adaptedClass.getRequester().getAgent().getResource() instanceof org.hl7.fhir.dstu3.model.Practitioner)
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

   public Iqicoreprocedurerequest setRequesterAdapterTarget(
         qicorepractitionerAdapter param)
   {
      adaptedClass.getRequester().setAgentTarget(param.getAdaptee());
      return this;
   }

   public Iqicoreprocedurerequest setRequesterAdapterTarget(
         qicorepatientAdapter param)
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
         throw new RuntimeException("Error getting Orderer", e);
      }
   }

   public RelatedPerson getRequesterRelatedPersonTarget()
   {
      return (org.hl7.fhir.dstu3.model.RelatedPerson) adaptedClass
            .getRequester().getAgentTarget();
   }

   public Iqicoreprocedurerequest setRequesterTarget(RelatedPerson param)
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

   public Iqicoreprocedurerequest setRequesterAdapterTarget(
         qicorerelatedpersonAdapter param)
   {
      adaptedClass.getRequester().setAgentTarget(param.getAdaptee());
      return this;
   }

   public Reference getRequesterDevice()
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

   public Device getRequesterDeviceTarget()
   {
      return (org.hl7.fhir.dstu3.model.Device) adaptedClass
            .getRequester().getAgentTarget();
   }

   public Iqicoreprocedurerequest setRequesterTarget(Device param)
   {
      adaptedClass.getRequester().setAgentTarget(param);
      return this;
   }

   public qicoredeviceAdapter getRequesterDeviceAdapterTarget()
   {
      if (adaptedClass.getRequester().getAgentTarget() instanceof org.hl7.fhir.dstu3.model.Device)
      {
         qicoredeviceAdapter profiledType = new qicoredeviceAdapter();
         profiledType
               .setAdaptee((org.hl7.fhir.dstu3.model.Device) adaptedClass
                     .getRequester().getAgentTarget());
         return profiledType;
      }
      else
      {
         return null;
      }
   }

   public Iqicoreprocedurerequest setRequesterAdapterTarget(
         qicoredeviceAdapter param)
   {
      adaptedClass.getRequester().setAgentTarget(param.getAdaptee());
      return this;
   }

   public CodeType getAppropriatenessScoreCodeType()
   {
      List<org.hl7.fhir.dstu3.model.Extension> extensions = adaptedClass
            .getExtensionsByUrl("http://hl7.org/fhir/qicore/StructureDefinition/procedurerequest-appropriatenessScore");
      if (extensions == null || extensions.size() <= 0)
      {
         return null;
      }
      else if (extensions.size() == 1)
      {
         return (org.hl7.fhir.dstu3.model.CodeType) extensions.get(0)
               .getValue();
      }
      else
      {
         throw new RuntimeException(
               "More than one extension exists for appropriatenessScore");
      }
   }

   public Iqicoreprocedurerequest setAppropriatenessScore(CodeType param)
   {
      adaptedClass
            .addExtension()
            .setUrl("http://hl7.org/fhir/qicore/StructureDefinition/procedurerequest-appropriatenessScore")
            .setValue(param);
      return this;
   }

   public DecimalType getAppropriatenessScoreDecimalType()
   {
      List<org.hl7.fhir.dstu3.model.Extension> extensions = adaptedClass
            .getExtensionsByUrl("http://hl7.org/fhir/qicore/StructureDefinition/procedurerequest-appropriatenessScore");
      if (extensions == null || extensions.size() <= 0)
      {
         return null;
      }
      else if (extensions.size() == 1)
      {
         return (org.hl7.fhir.dstu3.model.DecimalType) extensions.get(0)
               .getValue();
      }
      else
      {
         throw new RuntimeException(
               "More than one extension exists for appropriatenessScore");
      }
   }

   public Iqicoreprocedurerequest setAppropriatenessScore(DecimalType param)
   {
      adaptedClass
            .addExtension()
            .setUrl("http://hl7.org/fhir/qicore/StructureDefinition/procedurerequest-appropriatenessScore")
            .setValue(param);
      return this;
   }

   public List<CodeableConcept> getReasonCode()
   {
      try
      {
         return adaptedClass.getReasonCode()
                 ;
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Reason", e);
      }
   }

   public Iqicoreprocedurerequest setReasonCode(List<CodeableConcept> param)
   {
      adaptedClass.setReasonCode(param);
      return this;
   }

   public boolean hasReasonCode()
   {
      return adaptedClass.hasReasonCode();
   }

   public List<Reference> getReasonReference()
   {
      try
      {
         return adaptedClass.getReasonReference();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting ReasonReference", e);
      }
   }

   public Condition getReasonTarget()
   {
      return (org.hl7.fhir.dstu3.model.Condition) ((org.hl7.fhir.dstu3.model.Reference) adaptedClass
            .getReasonReference()).getResource();
   }

   public Iqicoreprocedurerequest setReason(List<Reference> param)
   {
      adaptedClass.setReasonReference(param);
      return this;
   }

   public Iqicoreprocedurerequest setReasonTarget(List<Resource> param)
   {
      List<Reference> references = new ArrayList<>();
      for (Resource resource : param) {
         references.add(new Reference(resource));
      }
      adaptedClass.setReasonReference(references);
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

   public ProcedureRequest.ProcedureRequestStatus getStatus()
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

   public Enumeration<ProcedureRequest.ProcedureRequestStatus> getStatusElement()
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

   public Iqicoreprocedurerequest setStatus(
         ProcedureRequest.ProcedureRequestStatus param)
   {
      adaptedClass.setStatus(param);
      return this;
   }

   public Iqicoreprocedurerequest setStatusElement(
         Enumeration<ProcedureRequest.ProcedureRequestStatus> param)
   {
      adaptedClass.setStatusElement(param);
      return this;
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

   public Iqicoreprocedurerequest setSubject(Reference param)
   {
      adaptedClass.setSubject(param);
      return this;
   }

   public Patient getSubjectPatientTarget()
   {
      return (org.hl7.fhir.dstu3.model.Patient) adaptedClass
            .getSubjectTarget();
   }

   public Iqicoreprocedurerequest setSubjectTarget(Patient param)
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

   public Iqicoreprocedurerequest setSubjectAdapterTarget(
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

   public Iqicoreprocedurerequest setSubjectTarget(Group param)
   {
      adaptedClass.setSubjectTarget(param);
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

   public Iqicoreprocedurerequest setOccurrence(Type param)
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
         throw new RuntimeException("Error getting ScheduledPeriod", e);
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

   public Iqicoreprocedurerequest setContained(List<Resource> param)
   {
      adaptedClass.setContained(param);
      return this;
   }

   public boolean hasContained()
   {
      return adaptedClass.hasContained();
   }

   public Iqicoreprocedurerequest addContained(Resource param)
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

   public Iqicoreprocedurerequest setContext(Reference param)
   {
      adaptedClass.setContext(param);
      return this;
   }

   public Encounter getContextTarget()
   {
      return (org.hl7.fhir.dstu3.model.Encounter) adaptedClass
            .getContextTarget();
   }

   public Iqicoreprocedurerequest setEncounterTarget(Encounter param)
   {
      adaptedClass.setContextTarget(param);
      return this;
   }

   public qicoreencounterAdapter getEncounterAdapterTarget()
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

   public Iqicoreprocedurerequest setEncounterAdapterTarget(
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

   public Iqicoreprocedurerequest setIdentifier(List<Identifier> param)
   {
      adaptedClass.setIdentifier(param);
      return this;
   }

   public boolean hasIdentifier()
   {
      return adaptedClass.hasIdentifier();
   }

   public Iqicoreprocedurerequest addIdentifier(Identifier param)
   {
      adaptedClass.addIdentifier(param);
      return this;
   }

   public Identifier addIdentifier()
   {
      return adaptedClass.addIdentifier();
   }

   public Type getAsNeeded()
   {
      try
      {
         return adaptedClass.getAsNeeded();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting AsNeeded", e);
      }
   }

   public Iqicoreprocedurerequest setAsNeeded(Type param)
   {
      adaptedClass.setAsNeeded(param);
      return this;
   }

   public BooleanType getAsNeededBooleanType()
   {
      try
      {
         return adaptedClass.getAsNeededBooleanType();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting AsNeededBooleanType", e);
      }
   }

   public boolean hasAsNeededBooleanType()
   {
      return adaptedClass.hasAsNeededBooleanType();
   }

   public CodeableConcept getAsNeededCodeableConcept()
   {
      try
      {
         return adaptedClass.getAsNeededCodeableConcept();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting AsNeededCodeableConcept",
               e);
      }
   }

   public boolean hasAsNeededCodeableConcept()
   {
      return adaptedClass.hasAsNeededCodeableConcept();
   }

   public List<CodeableConcept> getBodySite()
   {
      try
      {
         return adaptedClass.getBodySite();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting BodySite", e);
      }
   }

   public Iqicoreprocedurerequest setBodySite(List<CodeableConcept> param)
   {
      adaptedClass.setBodySite(param);
      return this;
   }

   public boolean hasBodySite()
   {
      return adaptedClass.hasBodySite();
   }

   public Iqicoreprocedurerequest addBodySite(CodeableConcept param)
   {
      adaptedClass.addBodySite(param);
      return this;
   }

   public CodeableConcept addBodySite()
   {
      return adaptedClass.addBodySite();
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

   public Iqicoreprocedurerequest setPerformer(Reference param)
   {
      adaptedClass.setPerformer(param);
      return this;
   }

   public Practitioner getPerformerPractitionerTarget()
   {
      return (org.hl7.fhir.dstu3.model.Practitioner) adaptedClass
            .getPerformerTarget();
   }

   public Iqicoreprocedurerequest setPerformerTarget(Practitioner param)
   {
      adaptedClass.setPerformerTarget(param);
      return this;
   }

   public qicorepractitionerAdapter getPerformerPractitionerAdapterTarget()
   {
      if (adaptedClass.getPerformer().getResource() instanceof org.hl7.fhir.dstu3.model.Practitioner)
      {
         qicorepractitionerAdapter profiledType = new qicorepractitionerAdapter();
         profiledType
               .setAdaptee((org.hl7.fhir.dstu3.model.Practitioner) adaptedClass
                     .getPerformer().getResource());
         return profiledType;
      }
      else
      {
         return null;
      }
   }

   public Iqicoreprocedurerequest setPerformerAdapterTarget(
         qicorepractitionerAdapter param)
   {
      adaptedClass.setPerformerTarget(param.getAdaptee());
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

   public Iqicoreprocedurerequest setPerformerTarget(Organization param)
   {
      adaptedClass.setPerformerTarget(param);
      return this;
   }

   public qicoreorganizationAdapter getPerformerOrganizationAdapterTarget()
   {
      if (adaptedClass.getPerformer().getResource() instanceof org.hl7.fhir.dstu3.model.Organization)
      {
         qicoreorganizationAdapter profiledType = new qicoreorganizationAdapter();
         profiledType
               .setAdaptee((org.hl7.fhir.dstu3.model.Organization) adaptedClass
                     .getPerformer().getResource());
         return profiledType;
      }
      else
      {
         return null;
      }
   }

   public Iqicoreprocedurerequest setPerformerAdapterTarget(
         qicoreorganizationAdapter param)
   {
      adaptedClass.setPerformerTarget(param.getAdaptee());
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

   public Iqicoreprocedurerequest setPerformerTarget(Patient param)
   {
      adaptedClass.setPerformerTarget(param);
      return this;
   }

   public qicorepatientAdapter getPerformerPatientAdapterTarget()
   {
      if (adaptedClass.getPerformer().getResource() instanceof org.hl7.fhir.dstu3.model.Patient)
      {
         qicorepatientAdapter profiledType = new qicorepatientAdapter();
         profiledType
               .setAdaptee((org.hl7.fhir.dstu3.model.Patient) adaptedClass
                     .getPerformer().getResource());
         return profiledType;
      }
      else
      {
         return null;
      }
   }

   public Iqicoreprocedurerequest setPerformerAdapterTarget(
         qicorepatientAdapter param)
   {
      adaptedClass.setPerformerTarget(param.getAdaptee());
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

   public Iqicoreprocedurerequest setPerformerTarget(RelatedPerson param)
   {
      adaptedClass.setPerformerTarget(param);
      return this;
   }

   public qicorerelatedpersonAdapter getPerformerRelatedPersonAdapterTarget()
   {
      if (adaptedClass.getPerformer().getResource() instanceof org.hl7.fhir.dstu3.model.RelatedPerson)
      {
         qicorerelatedpersonAdapter profiledType = new qicorerelatedpersonAdapter();
         profiledType
               .setAdaptee((org.hl7.fhir.dstu3.model.RelatedPerson) adaptedClass
                     .getPerformer().getResource());
         return profiledType;
      }
      else
      {
         return null;
      }
   }

   public Iqicoreprocedurerequest setPerformerAdapterTarget(
         qicorerelatedpersonAdapter param)
   {
      adaptedClass.setPerformerTarget(param.getAdaptee());
      return this;
   }

   public List<BodySite> getApproachBodySite() {
		List<org.hl7.fhir.dstu3.model.Extension> extensions = adaptedClass
				.getExtensionsByUrl("http://hl7.org/fhir/StructureDefinition/procedurerequest-approachBodySite");
		List<org.hl7.fhir.dstu3.model.BodySite> returnList = new java.util.ArrayList<>();
		for (org.hl7.fhir.dstu3.model.Extension extension : extensions) {
			org.hl7.fhir.dstu3.model.Reference reference = (org.hl7.fhir.dstu3.model.Reference) extension
					.getValue();
			returnList.add((org.hl7.fhir.dstu3.model.BodySite) reference
					.getResource());
		}
		return returnList;
	}

   public Iqicoreprocedurerequest setApproachBodySite(List<BodySite> param)
   {
      if (param != null && param.size() > 0)
      {
         for (int index = 0; index < param.size(); index++)
         {
            org.hl7.fhir.dstu3.model.Reference reference = new org.hl7.fhir.dstu3.model.Reference(
                  param.get(index));
            adaptedClass
                  .addExtension()
                  .setUrl("http://hl7.org/fhir/StructureDefinition/procedurerequest-approachBodySite")
                  .setValue(reference);
         }
      }
      return this;
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

   public Iqicoreprocedurerequest setCode(CodeableConcept param)
   {
      adaptedClass.setCode(param);
      return this;
   }

   public boolean hasCode()
   {
      return adaptedClass.hasCode();
   }
}
