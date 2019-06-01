package org.cqf.qicore.dstu3;

import org.hl7.fhir.dstu3.model.*;

import java.lang.String;
import java.util.List;

import org.hl7.fhir.dstu3.model.Dosage;

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

   public List<Dosage> getDosage()
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
         List<Dosage> param)
   {
      adaptedClass.setDosage(param);
      return this;
   }

   public boolean hasDosage()
   {
      return adaptedClass.hasDosage();
   }

   public qicoremedicationstatementAdapter addDosage(
		   Dosage param)
   {
      adaptedClass.addDosage(param);
      return this;
   }

   public Dosage addDosage()
   {
      return adaptedClass.addDosage();
   }

   public boolean hasCategory()
   {
      return adaptedClass.hasCategory();
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

   public Iqicoremedicationstatement setCategory(CodeableConcept param)
   {
      adaptedClass.setCategory(param);
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
         qicorepatientAdapter profiledType = new qicorepatientAdapter();
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
         qicorepractitionerAdapter profiledType = new qicorepractitionerAdapter();
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
         qicorerelatedpersonAdapter profiledType = new qicorerelatedpersonAdapter();
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
         throw new RuntimeException("Error getting Patient", e);
      }
   }

   public Iqicoremedicationstatement setSubject(Reference param)
   {
      adaptedClass.setSubject(param);
      return this;
   }

   public Patient getSubjectTarget()
   {
      return (org.hl7.fhir.dstu3.model.Patient) adaptedClass
            .getSubjectTarget();
   }

   public Iqicoremedicationstatement setSubjectTarget(Resource param)
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

   public Iqicoremedicationstatement setSubjectAdapterTarget(
         qicorepatientAdapter param)
   {
      adaptedClass.setSubjectTarget(param.getAdaptee());
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

   public boolean hasDerivedFrom()
   {
      return adaptedClass.hasDerivedFrom();
   }

   public List<Reference> getDerivedFrom()
   {
      return adaptedClass.getDerivedFrom();
   }

}
