package org.socraticgrid.fhir.dstu3.generated;

import org.socraticgrid.fhir.dstu3.generated.Iqicoremedicationstatement;
import org.hl7.fhir.dstu3.model.MedicationStatement;
import org.hl7.fhir.dstu3.model.UriType;
import java.lang.String;
import org.hl7.fhir.dstu3.model.Identifier;
import java.util.List;
import org.hl7.fhir.dstu3.model.Reference;
import org.hl7.fhir.dstu3.model.Annotation;
import org.hl7.fhir.dstu3.model.Enumeration;
import org.hl7.fhir.dstu3.model.CodeableConcept;
import org.hl7.fhir.dstu3.model.IdType;
import org.hl7.fhir.dstu3.model.Resource;
import org.hl7.fhir.dstu3.model.Patient;
import org.hl7.fhir.dstu3.model.Practitioner;
import org.hl7.fhir.dstu3.model.RelatedPerson;
import org.hl7.fhir.dstu3.model.CodeType;
import org.hl7.fhir.dstu3.model.Type;
import org.hl7.fhir.dstu3.model.DateTimeType;
import org.hl7.fhir.dstu3.model.Enumerations;
import org.hl7.fhir.dstu3.model.Period;
import org.hl7.fhir.dstu3.model.Medication;
import org.hl7.fhir.dstu3.model.BooleanType;
import java.lang.Boolean;
import org.hl7.fhir.dstu3.model.*;
import ca.uhn.fhir.model.api.ExtensionDt;

public class qicoremedicationstatementAdapter implements Iqicoremedicationstatement
{

   private MedicationStatement adaptedClass;

   public qicoremedicationstatementAdapter()
   {
      this.adaptedClass = new org.hl7.fhir.dstu3.model.MedicationStatement();
   }

   public qicoremedicationstatementAdapter(MedicationStatement adaptee)
   {
      this.adaptedClass = adaptee;
   }

   public MedicationStatement getAdaptee()
   {
      return adaptedClass;
   }

   public void setAdaptee(MedicationStatement param)
   {
      this.adaptedClass = param;
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

   public Iqicoremedicationstatement setImplicitRulesElement(UriType param)
   {
      adaptedClass.setImplicitRulesElement(param);
      return this;
   }

   public Iqicoremedicationstatement setImplicitRules(String param)
   {
      adaptedClass.setImplicitRules(param);
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

   public Iqicoremedicationstatement setIdentifier(List<Identifier> param)
   {
      adaptedClass.setIdentifier(param);
      return this;
   }

   public boolean hasIdentifier()
   {
      return adaptedClass.hasIdentifier();
   }

   public Iqicoremedicationstatement addIdentifier(Identifier param)
   {
      adaptedClass.addIdentifier(param);
      return this;
   }

   public Identifier addIdentifier()
   {
      return adaptedClass.addIdentifier();
   }

   public boolean hasReasonForUseReference()
   {
      return adaptedClass.hasReasonForUseReference();
   }

   public List<Reference> getReasonForUseReference()
   {
      return adaptedClass.getReasonForUseReference();
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

   public Iqicoremedicationstatement setNote(List<Annotation> param)
   {
      adaptedClass.setNote(param);
      return this;
   }

   public boolean hasNote()
   {
      return adaptedClass.hasNote();
   }

   public Iqicoremedicationstatement addNote(Annotation param)
   {
      adaptedClass.addNote(param);
      return this;
   }

   public Annotation addNote()
   {
      return adaptedClass.addNote();
   }

   public List<MedicationStatement.MedicationStatementDosageComponent> getDosage()
   {
      try
      {
         return adaptedClass.getDosage();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Dosage", e);
      }
   }

   public qicoremedicationstatementAdapter setDosage(
         List<MedicationStatement.MedicationStatementDosageComponent> param)
   {
      adaptedClass.setDosage(param);
      return this;
   }

   public boolean hasDosage()
   {
      return adaptedClass.hasDosage();
   }

   public qicoremedicationstatementAdapter addDosage(
         MedicationStatement.MedicationStatementDosageComponent param)
   {
      adaptedClass.addDosage(param);
      return this;
   }

   public MedicationStatement.MedicationStatementDosageComponent addDosage()
   {
      return adaptedClass.addDosage();
   }

   public boolean hasCategory()
   {
      return adaptedClass.hasCategory();
   }

   public boolean hasCategoryElement()
   {
      return adaptedClass.hasCategoryElement();
   }

   public MedicationStatement.MedicationStatementCategory getCategory()
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

   public Enumeration<MedicationStatement.MedicationStatementCategory> getCategoryElement()
   {
      try
      {
         return adaptedClass.getCategoryElement();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting CategoryElement", e);
      }
   }

   public Iqicoremedicationstatement setCategory(
         MedicationStatement.MedicationStatementCategory param)
   {
      adaptedClass.setCategory(param);
      return this;
   }

   public Iqicoremedicationstatement setCategoryElement(
         Enumeration<MedicationStatement.MedicationStatementCategory> param)
   {
      adaptedClass.setCategoryElement(param);
      return this;
   }

   public List<CodeableConcept> getReasonForUseCode()
   {
      try
      {
         return adaptedClass.getReasonForUseCode();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting ReasonForUseCode", e);
      }
   }

   public Iqicoremedicationstatement setReasonForUseCode(
         List<CodeableConcept> param)
   {
      adaptedClass.setReasonForUseCode(param);
      return this;
   }

   public boolean hasReasonForUseCode()
   {
      return adaptedClass.hasReasonForUseCode();
   }

   public Iqicoremedicationstatement addReasonForUseCode(CodeableConcept param)
   {
      adaptedClass.addReasonForUseCode(param);
      return this;
   }

   public CodeableConcept addReasonForUseCode()
   {
      return adaptedClass.addReasonForUseCode();
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

   public Iqicoremedicationstatement setIdElement(IdType param)
   {
      adaptedClass.setIdElement(param);
      return this;
   }

   public Iqicoremedicationstatement setId(String param)
   {
      adaptedClass.setId(param);
      return this;
   }

   public Reference getInformationSource()
   {
      try
      {
         return adaptedClass.getInformationSource();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting InformationSource", e);
      }
   }

   public Resource getInformationSourceTarget()
   {
      try
      {
         return adaptedClass.getInformationSourceTarget();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting InformationSourceTarget",
               e);
      }
   }

   public boolean hasInformationSource()
   {
      return adaptedClass.hasInformationSource();
   }

   public Reference getInformationSourcePatient()
   {
      try
      {
         return adaptedClass.getInformationSource();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting InformationSource", e);
      }
   }

   public Iqicoremedicationstatement setInformationSource(Reference param)
   {
      adaptedClass.setInformationSource(param);
      return this;
   }

   public Patient getInformationSourcePatientTarget()
   {
      return (org.hl7.fhir.dstu3.model.Patient) adaptedClass
            .getInformationSourceTarget();
   }

   public Iqicoremedicationstatement setInformationSourceTarget(Patient param)
   {
      adaptedClass.setInformationSourceTarget(param);
      return this;
   }

   public qicorepatientAdapter getInformationSourcePatientAdapterTarget()
   {
      if (adaptedClass.getInformationSource().getResource() instanceof org.hl7.fhir.dstu3.model.Patient)
      {
         org.socraticgrid.fhir.dstu3.generated.qicorepatientAdapter profiledType = new org.socraticgrid.fhir.dstu3.generated.qicorepatientAdapter();
         profiledType
               .setAdaptee((org.hl7.fhir.dstu3.model.Patient) adaptedClass
                     .getInformationSource().getResource());
         return profiledType;
      }
      else
      {
         return null;
      }
   }

   public Iqicoremedicationstatement setInformationSourceAdapterTarget(
         qicorepatientAdapter param)
   {
      adaptedClass.setInformationSourceTarget(param.getAdaptee());
      return this;
   }

   public Reference getInformationSourcePractitioner()
   {
      try
      {
         return adaptedClass.getInformationSource();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting InformationSource", e);
      }
   }

   public Practitioner getInformationSourcePractitionerTarget()
   {
      return (org.hl7.fhir.dstu3.model.Practitioner) adaptedClass
            .getInformationSourceTarget();
   }

   public Iqicoremedicationstatement setInformationSourceTarget(
         Practitioner param)
   {
      adaptedClass.setInformationSourceTarget(param);
      return this;
   }

   public qicorepractitionerAdapter getInformationSourcePractitionerAdapterTarget()
   {
      if (adaptedClass.getInformationSource().getResource() instanceof org.hl7.fhir.dstu3.model.Practitioner)
      {
         org.socraticgrid.fhir.dstu3.generated.qicorepractitionerAdapter profiledType = new org.socraticgrid.fhir.dstu3.generated.qicorepractitionerAdapter();
         profiledType
               .setAdaptee((org.hl7.fhir.dstu3.model.Practitioner) adaptedClass
                     .getInformationSource().getResource());
         return profiledType;
      }
      else
      {
         return null;
      }
   }

   public Iqicoremedicationstatement setInformationSourceAdapterTarget(
         qicorepractitionerAdapter param)
   {
      adaptedClass.setInformationSourceTarget(param.getAdaptee());
      return this;
   }

   public Reference getInformationSourceRelatedPerson()
   {
      try
      {
         return adaptedClass.getInformationSource();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting InformationSource", e);
      }
   }

   public RelatedPerson getInformationSourceRelatedPersonTarget()
   {
      return (org.hl7.fhir.dstu3.model.RelatedPerson) adaptedClass
            .getInformationSourceTarget();
   }

   public Iqicoremedicationstatement setInformationSourceTarget(
         RelatedPerson param)
   {
      adaptedClass.setInformationSourceTarget(param);
      return this;
   }

   public qicorerelatedpersonAdapter getInformationSourceRelatedPersonAdapterTarget()
   {
      if (adaptedClass.getInformationSource().getResource() instanceof org.hl7.fhir.dstu3.model.RelatedPerson)
      {
         org.socraticgrid.fhir.dstu3.generated.qicorerelatedpersonAdapter profiledType = new org.socraticgrid.fhir.dstu3.generated.qicorerelatedpersonAdapter();
         profiledType
               .setAdaptee((org.hl7.fhir.dstu3.model.RelatedPerson) adaptedClass
                     .getInformationSource().getResource());
         return profiledType;
      }
      else
      {
         return null;
      }
   }

   public Iqicoremedicationstatement setInformationSourceAdapterTarget(
         qicorerelatedpersonAdapter param)
   {
      adaptedClass.setInformationSourceTarget(param.getAdaptee());
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

   public Iqicoremedicationstatement setLanguageElement(CodeType param)
   {
      adaptedClass.setLanguageElement(param);
      return this;
   }

   public Iqicoremedicationstatement setLanguage(String param)
   {
      adaptedClass.setLanguage(param);
      return this;
   }

   public boolean hasPatient()
   {
      return adaptedClass.hasPatient();
   }

   public Reference getPatient()
   {
      try
      {
         return adaptedClass.getPatient();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Patient", e);
      }
   }

   public Iqicoremedicationstatement setPatient(Reference param)
   {
      adaptedClass.setPatient(param);
      return this;
   }

   public Patient getPatientTarget()
   {
      return (org.hl7.fhir.dstu3.model.Patient) adaptedClass
            .getPatientTarget();
   }

   public Iqicoremedicationstatement setPatientTarget(Patient param)
   {
      adaptedClass.setPatientTarget(param);
      return this;
   }

   public qicorepatientAdapter getPatientAdapterTarget()
   {
      if (adaptedClass.getPatient().getResource() instanceof org.hl7.fhir.dstu3.model.Patient)
      {
         org.socraticgrid.fhir.dstu3.generated.qicorepatientAdapter profiledType = new org.socraticgrid.fhir.dstu3.generated.qicorepatientAdapter();
         profiledType
               .setAdaptee((org.hl7.fhir.dstu3.model.Patient) adaptedClass
                     .getPatient().getResource());
         return profiledType;
      }
      else
      {
         return null;
      }
   }

   public Iqicoremedicationstatement setPatientAdapterTarget(
         qicorepatientAdapter param)
   {
      adaptedClass.setPatientTarget(param.getAdaptee());
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

   public MedicationStatement.MedicationStatementStatus getStatus()
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

   public Enumeration<MedicationStatement.MedicationStatementStatus> getStatusElement()
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

   public Iqicoremedicationstatement setStatus(
         MedicationStatement.MedicationStatementStatus param)
   {
      adaptedClass.setStatus(param);
      return this;
   }

   public Iqicoremedicationstatement setStatusElement(
         Enumeration<MedicationStatement.MedicationStatementStatus> param)
   {
      adaptedClass.setStatusElement(param);
      return this;
   }

   public Type getEffective()
   {
      try
      {
         return adaptedClass.getEffective();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Effective", e);
      }
   }

   public Iqicoremedicationstatement setEffective(Type param)
   {
      adaptedClass.setEffective(param);
      return this;
   }

   public DateTimeType getEffectiveDateTimeType()
   {
      try
      {
         return adaptedClass.getEffectiveDateTimeType();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting EffectiveDateTimeType", e);
      }
   }

   public boolean hasEffectiveDateTimeType()
   {
      return adaptedClass.hasEffectiveDateTimeType();
   }

   public Period getEffectivePeriod()
   {
      try
      {
         return adaptedClass.getEffectivePeriod();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting EffectivePeriod", e);
      }
   }

   public boolean hasEffectivePeriod()
   {
      return adaptedClass.hasEffectivePeriod();
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

   public Iqicoremedicationstatement setContained(List<Resource> param)
   {
      adaptedClass.setContained(param);
      return this;
   }

   public boolean hasContained()
   {
      return adaptedClass.hasContained();
   }

   public Iqicoremedicationstatement addContained(Resource param)
   {
      adaptedClass.addContained(param);
      return this;
   }

   public List<CodeableConcept> getReasonNotTaken()
   {
      try
      {
         return adaptedClass.getReasonNotTaken();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting ReasonNotTaken", e);
      }
   }

   public Iqicoremedicationstatement setReasonNotTaken(
         List<CodeableConcept> param)
   {
      adaptedClass.setReasonNotTaken(param);
      return this;
   }

   public boolean hasReasonNotTaken()
   {
      return adaptedClass.hasReasonNotTaken();
   }

   public Iqicoremedicationstatement addReasonNotTaken(CodeableConcept param)
   {
      adaptedClass.addReasonNotTaken(param);
      return this;
   }

   public CodeableConcept addReasonNotTaken()
   {
      return adaptedClass.addReasonNotTaken();
   }

   public Type getMedication()
   {
      try
      {
         return adaptedClass.getMedication();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Medication", e);
      }
   }

   public Iqicoremedicationstatement setMedication(Type param)
   {
      adaptedClass.setMedication(param);
      return this;
   }

   public CodeableConcept getMedicationCodeableConcept()
   {
      try
      {
         return adaptedClass.getMedicationCodeableConcept();
      }
      catch (Exception e)
      {
         throw new RuntimeException(
               "Error getting MedicationCodeableConcept", e);
      }
   }

   public boolean hasMedicationCodeableConcept()
   {
      return adaptedClass.hasMedicationCodeableConcept();
   }

   public boolean hasMedication()
   {
      return adaptedClass.hasMedication();
   }

   public Reference getMedicationReference()
   {
      try
      {
         return adaptedClass.getMedicationReference();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting MedicationReference", e);
      }
   }

   public Medication getMedicationTarget()
   {
      return (org.hl7.fhir.dstu3.model.Medication) ((org.hl7.fhir.dstu3.model.Reference) adaptedClass
            .getMedication()).getResource();
   }

   public Iqicoremedicationstatement setMedication(Reference param)
   {
      adaptedClass.setMedication(param);
      return this;
   }

   public Iqicoremedicationstatement setMedicationTarget(Medication param)
   {
      Reference reference = new Reference(param);
      adaptedClass.setMedication(reference);
      return this;
   }

   public boolean hasSupportingInformation()
   {
      return adaptedClass.hasSupportingInformation();
   }

   public List<Reference> getSupportingInformation()
   {
      return adaptedClass.getSupportingInformation();
   }

   public boolean hasNotTaken()
   {
      return adaptedClass.hasNotTaken();
   }

   public boolean hasNotTakenElement()
   {
      return adaptedClass.hasNotTakenElement();
   }

   public BooleanType getNotTakenElement()
   {
      try
      {
         return adaptedClass.getNotTakenElement();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting NotTakenElement", e);
      }
   }

   public Boolean getNotTaken()
   {
      try
      {
         return adaptedClass.getNotTaken();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting NotTaken", e);
      }
   }

   public Iqicoremedicationstatement setNotTakenElement(BooleanType param)
   {
      adaptedClass.setNotTakenElement(param);
      return this;
   }

   public Iqicoremedicationstatement setNotTaken(Boolean param)
   {
      adaptedClass.setNotTaken(param);
      return this;
   }
}