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

public class qicoreconditionAdapter implements Iqicorecondition
{

   private Condition adaptedClass;

   public qicoreconditionAdapter()
   {
      this.adaptedClass = new org.hl7.fhir.dstu3.model.Condition();
   }

   public qicoreconditionAdapter(Condition adaptee)
   {
      this.adaptedClass = adaptee;
   }

   public Condition getAdaptee()
   {
      return adaptedClass;
   }

   public void setAdaptee(Condition param)
   {
      this.adaptedClass = param;
   }

   public List<Condition.ConditionEvidenceComponent> getEvidence()
   {
      try
      {
         return adaptedClass.getEvidence();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Evidence", e);
      }
   }

   public qicoreconditionAdapter setEvidence(
         List<Condition.ConditionEvidenceComponent> param)
   {
      adaptedClass.setEvidence(param);
      return this;
   }

   public boolean hasEvidence()
   {
      return adaptedClass.hasEvidence();
   }

   public qicoreconditionAdapter addEvidence(
         Condition.ConditionEvidenceComponent param)
   {
      adaptedClass.addEvidence(param);
      return this;
   }

   public Condition.ConditionEvidenceComponent addEvidence()
   {
      return adaptedClass.addEvidence();
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

   public Iqicorecondition setCategory(List<CodeableConcept> param)
   {
      adaptedClass.setCategory(param);
      return this;
   }

   public boolean hasCategory()
   {
      return adaptedClass.hasCategory();
   }

   public Reference getAsserter()
   {
      try
      {
         return adaptedClass.getAsserter();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Asserter", e);
      }
   }

   public Resource getAsserterTarget()
   {
      try
      {
         return adaptedClass.getAsserterTarget();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting AsserterTarget", e);
      }
   }

   public boolean hasAsserter()
   {
      return adaptedClass.hasAsserter();
   }

   public Reference getAsserterPatient()
   {
      try
      {
         return adaptedClass.getAsserter();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Asserter", e);
      }
   }

   public Iqicorecondition setAsserter(Reference param)
   {
      adaptedClass.setAsserter(param);
      return this;
   }

   public Patient getAsserterPatientTarget()
   {
      return (org.hl7.fhir.dstu3.model.Patient) adaptedClass
            .getAsserterTarget();
   }

   public Iqicorecondition setAsserterTarget(Patient param)
   {
      adaptedClass.setAsserterTarget(param);
      return this;
   }

   public qicorepatientAdapter getAsserterPatientAdapterTarget()
   {
      if (adaptedClass.getAsserter().getResource() instanceof org.hl7.fhir.dstu3.model.Patient)
      {
         qicorepatientAdapter profiledType = new qicorepatientAdapter();
         profiledType
               .setAdaptee((org.hl7.fhir.dstu3.model.Patient) adaptedClass
                     .getAsserter().getResource());
         return profiledType;
      }
      else
      {
         return null;
      }
   }

   public Iqicorecondition setAsserterAdapterTarget(qicorepatientAdapter param)
   {
      adaptedClass.setAsserterTarget(param.getAdaptee());
      return this;
   }

   public Reference getAsserterPractitioner()
   {
      try
      {
         return adaptedClass.getAsserter();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Asserter", e);
      }
   }

   public Practitioner getAsserterPractitionerTarget()
   {
      return (org.hl7.fhir.dstu3.model.Practitioner) adaptedClass
            .getAsserterTarget();
   }

   public Iqicorecondition setAsserterTarget(Practitioner param)
   {
      adaptedClass.setAsserterTarget(param);
      return this;
   }

   public qicorepractitionerAdapter getAsserterPractitionerAdapterTarget()
   {
      if (adaptedClass.getAsserter().getResource() instanceof org.hl7.fhir.dstu3.model.Practitioner)
      {
         qicorepractitionerAdapter profiledType = new qicorepractitionerAdapter();
         profiledType
               .setAdaptee((org.hl7.fhir.dstu3.model.Practitioner) adaptedClass
                     .getAsserter().getResource());
         return profiledType;
      }
      else
      {
         return null;
      }
   }

   public Iqicorecondition setAsserterAdapterTarget(
         qicorepractitionerAdapter param)
   {
      adaptedClass.setAsserterTarget(param.getAdaptee());
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

   public Iqicorecondition setContext(Reference param)
   {
      adaptedClass.setContext(param);
      return this;
   }

   public Encounter getContextTarget()
   {
      return (org.hl7.fhir.dstu3.model.Encounter) adaptedClass
            .getContextTarget();
   }

   public Iqicorecondition setContextTarget(Encounter param)
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

   public Iqicorecondition setContextAdapterTarget(qicoreencounterAdapter param)
   {
      adaptedClass.setContextTarget(param.getAdaptee());
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

   public Iqicorecondition setContained(List<Resource> param)
   {
      adaptedClass.setContained(param);
      return this;
   }

   public boolean hasContained()
   {
      return adaptedClass.hasContained();
   }

   public Iqicorecondition addContained(Resource param)
   {
      adaptedClass.addContained(param);
      return this;
   }

   public Type getAbatement()
   {
      try
      {
         return adaptedClass.getAbatement();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Abatement", e);
      }
   }

   public Iqicorecondition setAbatement(Type param)
   {
      adaptedClass.setAbatement(param);
      return this;
   }

   public DateTimeType getAbatementDateTimeType()
   {
      try
      {
         return adaptedClass.getAbatementDateTimeType();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting AbatementDateTimeType", e);
      }
   }

   public boolean hasAbatementDateTimeType()
   {
      return adaptedClass.hasAbatementDateTimeType();
   }

   public Age getAbatementAge()
   {
      try
      {
         return adaptedClass.getAbatementAge();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting AbatementAge", e);
      }
   }

   public boolean hasAbatementAge()
   {
      return adaptedClass.hasAbatementAge();
   }

   public BooleanType getAbatementBooleanType()
   {
      try
      {
         return adaptedClass.getAbatementBooleanType();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting AbatementBooleanType", e);
      }
   }

   public boolean hasAbatementBooleanType()
   {
      return adaptedClass.hasAbatementBooleanType();
   }

   public Period getAbatementPeriod()
   {
      try
      {
         return adaptedClass.getAbatementPeriod();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting AbatementPeriod", e);
      }
   }

   public boolean hasAbatementPeriod()
   {
      return adaptedClass.hasAbatementPeriod();
   }

   public Range getAbatementRange()
   {
      try
      {
         return adaptedClass.getAbatementRange();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting AbatementRange", e);
      }
   }

   public boolean hasAbatementRange()
   {
      return adaptedClass.hasAbatementRange();
   }

   public StringType getAbatementStringType()
   {
      try
      {
         return adaptedClass.getAbatementStringType();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting AbatementStringType", e);
      }
   }

   public boolean hasAbatementStringType()
   {
      return adaptedClass.hasAbatementStringType();
   }

   public Condition.ConditionStageComponent getStage()
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

   public qicoreconditionAdapter setStage(
         Condition.ConditionStageComponent param)
   {
      adaptedClass.setStage(param);
      return this;
   }

   public boolean hasStage()
   {
      return adaptedClass.hasStage();
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

   public Iqicorecondition setLanguageElement(CodeType param)
   {
      adaptedClass.setLanguageElement(param);
      return this;
   }

   public Iqicorecondition setLanguage(String param)
   {
      adaptedClass.setLanguage(param);
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

   public Iqicorecondition setImplicitRulesElement(UriType param)
   {
      adaptedClass.setImplicitRulesElement(param);
      return this;
   }

   public Iqicorecondition setImplicitRules(String param)
   {
      adaptedClass.setImplicitRules(param);
      return this;
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

   public Iqicorecondition setBodySite(List<CodeableConcept> param)
   {
      adaptedClass.setBodySite(param);
      return this;
   }

   public boolean hasBodySite()
   {
      return adaptedClass.hasBodySite();
   }

   public Iqicorecondition addBodySite(CodeableConcept param)
   {
      adaptedClass.addBodySite(param);
      return this;
   }

   public CodeableConcept addBodySite()
   {
      return adaptedClass.addBodySite();
   }

   public CodeableConcept getCriticality()
   {
      List<org.hl7.fhir.dstu3.model.Extension> extensions = adaptedClass
            .getExtensionsByUrl("http://hl7.org/fhir/StructureDefinition/condition-criticality");
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
               "More than one extension exists for criticality");
      }
   }

   public Iqicorecondition setCriticality(CodeableConcept param)
   {
      adaptedClass
            .addExtension()
            .setUrl("http://hl7.org/fhir/StructureDefinition/condition-criticality")
            .setValue(param);
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

   public Iqicorecondition setIdentifier(List<Identifier> param)
   {
      adaptedClass.setIdentifier(param);
      return this;
   }

   public boolean hasIdentifier()
   {
      return adaptedClass.hasIdentifier();
   }

   public Iqicorecondition addIdentifier(Identifier param)
   {
      adaptedClass.addIdentifier(param);
      return this;
   }

   public Identifier addIdentifier()
   {
      return adaptedClass.addIdentifier();
   }

   public boolean hasClinicalStatus()
   {
      return adaptedClass.hasClinicalStatus();
   }

   public boolean hasClinicalStatusElement()
   {
      return adaptedClass.hasClinicalStatusElement();
   }

   public Condition.ConditionClinicalStatus getClinicalStatus()
   {
      try
      {
         return adaptedClass.getClinicalStatus();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting ClinicalStatus", e);
      }
   }

   public Enumeration<Condition.ConditionClinicalStatus> getClinicalStatusElement()
   {
      try
      {
         return adaptedClass.getClinicalStatusElement();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting ClinicalStatusElement", e);
      }
   }

   public Iqicorecondition setClinicalStatus(
         Condition.ConditionClinicalStatus param)
   {
      adaptedClass.setClinicalStatus(param);
      return this;
   }

   public Iqicorecondition setClinicalStatusElement(
         Enumeration<Condition.ConditionClinicalStatus> param)
   {
      adaptedClass.setClinicalStatusElement(param);
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

   public Iqicorecondition setCode(CodeableConcept param)
   {
      adaptedClass.setCode(param);
      return this;
   }

   public boolean hasCode()
   {
      return adaptedClass.hasCode();
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

   public Iqicorecondition setSubject(Reference param)
   {
      adaptedClass.setSubject(param);
      return this;
   }

   public Patient getSubjectTarget()
   {
      return (org.hl7.fhir.dstu3.model.Patient) adaptedClass
            .getSubjectTarget();
   }

   public Iqicorecondition setSubjectTarget(Patient param)
   {
      adaptedClass.setSubjectTarget(param);
      return this;
   }

   public qicorepatientAdapter getSubjectAdapterTarget()
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

   public Iqicorecondition setSubjectAdapterTarget(qicorepatientAdapter param)
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

   public Iqicorecondition setNote(List<Annotation> param)
   {
      adaptedClass.setNote(param);
      return this;
   }

   public boolean hasNote()
   {
      return adaptedClass.hasNote();
   }

   public Iqicorecondition addNote(Annotation param)
   {
      adaptedClass.addNote(param);
      return this;
   }

   public Annotation addNote()
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

   public Iqicorecondition setIdElement(IdType param)
   {
      adaptedClass.setIdElement(param);
      return this;
   }

   public Iqicorecondition setId(String param)
   {
      adaptedClass.setId(param);
      return this;
   }

   public CodeableConcept getSeverity()
   {
      try
      {
         return adaptedClass.getSeverity();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Severity", e);
      }
   }

   public Iqicorecondition setSeverity(CodeableConcept param)
   {
      adaptedClass.setSeverity(param);
      return this;
   }

   public boolean hasSeverity()
   {
      return adaptedClass.hasSeverity();
   }

   public boolean hasAssertedDate()
   {
      return adaptedClass.hasAssertedDate();
   }

   public boolean hasAssertedDateElement()
   {
      return adaptedClass.hasAssertedDateElement();
   }

   public DateType getAssertedDateElement()
   {
      try
      {
         return adaptedClass.getAssertedDateElement();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting DateRecordedElement", e);
      }
   }

   public Date getAssertedDate()
   {
      try
      {
         return adaptedClass.getAssertedDate();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting DateRecorded", e);
      }
   }

   public Iqicorecondition setAssertedDateElement(DateType param)
   {
      adaptedClass.setAssertedDateElement(param);
      return this;
   }

   public Iqicorecondition setAssertedDate(Date param)
   {
      adaptedClass.setAssertedDate(param);
      return this;
   }

   public boolean hasVerificationStatus()
   {
      return adaptedClass.hasVerificationStatus();
   }

   public boolean hasVerificationStatusElement()
   {
      return adaptedClass.hasVerificationStatusElement();
   }

   public Condition.ConditionVerificationStatus getVerificationStatus()
   {
      try
      {
         return adaptedClass.getVerificationStatus();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting VerificationStatus", e);
      }
   }

   public Enumeration<Condition.ConditionVerificationStatus> getVerificationStatusElement()
   {
      try
      {
         return adaptedClass.getVerificationStatusElement();
      }
      catch (Exception e)
      {
         throw new RuntimeException(
               "Error getting VerificationStatusElement", e);
      }
   }

   public Iqicorecondition setVerificationStatus(
         Condition.ConditionVerificationStatus param)
   {
      adaptedClass.setVerificationStatus(param);
      return this;
   }

   public Iqicorecondition setVerificationStatusElement(
         Enumeration<Condition.ConditionVerificationStatus> param)
   {
      adaptedClass.setVerificationStatusElement(param);
      return this;
   }

   public Type getOnset()
   {
      try
      {
         return adaptedClass.getOnset();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Onset", e);
      }
   }

   public Iqicorecondition setOnset(Type param)
   {
      adaptedClass.setOnset(param);
      return this;
   }

   public DateTimeType getOnsetDateTimeType()
   {
      try
      {
         return adaptedClass.getOnsetDateTimeType();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting OnsetDateTimeType", e);
      }
   }

   public boolean hasOnsetDateTimeType()
   {
      return adaptedClass.hasOnsetDateTimeType();
   }

   public Age getOnsetAge()
   {
      try
      {
         return adaptedClass.getOnsetAge();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting OnsetAge", e);
      }
   }

   public boolean hasOnsetAge()
   {
      return adaptedClass.hasOnsetAge();
   }

   public Period getOnsetPeriod()
   {
      try
      {
         return adaptedClass.getOnsetPeriod();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting OnsetPeriod", e);
      }
   }

   public boolean hasOnsetPeriod()
   {
      return adaptedClass.hasOnsetPeriod();
   }

   public Range getOnsetRange()
   {
      try
      {
         return adaptedClass.getOnsetRange();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting OnsetRange", e);
      }
   }

   public boolean hasOnsetRange()
   {
      return adaptedClass.hasOnsetRange();
   }

   public StringType getOnsetStringType()
   {
      try
      {
         return adaptedClass.getOnsetStringType();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting OnsetStringType", e);
      }
   }

   public boolean hasOnsetStringType()
   {
      return adaptedClass.hasOnsetStringType();
   }
}