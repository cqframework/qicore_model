package org.cqf.qicore.dstu3;

import org.hl7.fhir.dstu3.model.MedicationStatement;
import org.hl7.fhir.dstu3.model.MedicationStatement.MedicationStatementNotTaken;

import java.util.List;

import org.hl7.fhir.dstu3.model.UriType;

import java.lang.String;

import org.hl7.fhir.dstu3.model.Identifier;
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
import org.hl7.fhir.dstu3.model.DosageInstruction;
import org.hl7.fhir.dstu3.model.Period;
import org.hl7.fhir.dstu3.model.Medication;
import org.hl7.fhir.dstu3.model.BooleanType;

import java.lang.Boolean;

public interface Iqicoremedicationstatement
{

   public MedicationStatement getAdaptee();

   public void setAdaptee(MedicationStatement param);

   public boolean hasImplicitRules();

   public boolean hasImplicitRulesElement();

   public UriType getImplicitRulesElement();

   public String getImplicitRules();

   public Iqicoremedicationstatement setImplicitRulesElement(UriType param);

   public Iqicoremedicationstatement setImplicitRules(String param);

   public List<Identifier> getIdentifier();

   public Iqicoremedicationstatement setIdentifier(List<Identifier> param);

   public boolean hasIdentifier();

   public Iqicoremedicationstatement addIdentifier(Identifier param);

   public Identifier addIdentifier();

   public boolean hasReasonForUseReference();

   public List<Reference> getReasonForUseReference();

   public List<Annotation> getNote();

   public Iqicoremedicationstatement setNote(List<Annotation> param);

   public boolean hasNote();

   public Iqicoremedicationstatement addNote(Annotation param);

   public Annotation addNote();

   public List<DosageInstruction> getDosage();

   public qicoremedicationstatementAdapter setDosage(
         List<DosageInstruction> param);

   public boolean hasDosage();

   public qicoremedicationstatementAdapter addDosage(
		   DosageInstruction param);

   public DosageInstruction addDosage();

   public boolean hasCategory();

   public boolean hasCategoryElement();

   public MedicationStatement.MedicationStatementCategory getCategory();

   public Enumeration<MedicationStatement.MedicationStatementCategory> getCategoryElement();

   public Iqicoremedicationstatement setCategory(
         MedicationStatement.MedicationStatementCategory param);

   public Iqicoremedicationstatement setCategoryElement(
         Enumeration<MedicationStatement.MedicationStatementCategory> param);

   public List<CodeableConcept> getReasonForUseCodeableConcept();

   public Iqicoremedicationstatement setReasonForUseCodeableConcept(
         List<CodeableConcept> param);

   public boolean hasReasonForUseCodeableConcept();

   public Iqicoremedicationstatement addReasonForUseCodeableConcept(CodeableConcept param);

   public CodeableConcept addReasonForUseCodeableConcept();

   public boolean hasId();

   public boolean hasIdElement();

   public IdType getIdElement();

   public String getId();

   public Iqicoremedicationstatement setIdElement(IdType param);

   public Iqicoremedicationstatement setId(String param);

   public Reference getInformationSource();

   public Resource getInformationSourceTarget();

   public boolean hasInformationSource();

   public Reference getInformationSourcePatient();

   public Iqicoremedicationstatement setInformationSource(Reference param);

   public Patient getInformationSourcePatientTarget();

   public Iqicoremedicationstatement setInformationSourceTarget(Patient param);

   public qicorepatientAdapter getInformationSourcePatientAdapterTarget();

   public Iqicoremedicationstatement setInformationSourceAdapterTarget(
         qicorepatientAdapter param);

   public Reference getInformationSourcePractitioner();

   public Practitioner getInformationSourcePractitionerTarget();

   public Iqicoremedicationstatement setInformationSourceTarget(
         Practitioner param);

   public qicorepractitionerAdapter getInformationSourcePractitionerAdapterTarget();

   public Iqicoremedicationstatement setInformationSourceAdapterTarget(
         qicorepractitionerAdapter param);

   public Reference getInformationSourceRelatedPerson();

   public RelatedPerson getInformationSourceRelatedPersonTarget();

   public Iqicoremedicationstatement setInformationSourceTarget(
         RelatedPerson param);

   public qicorerelatedpersonAdapter getInformationSourceRelatedPersonAdapterTarget();

   public Iqicoremedicationstatement setInformationSourceAdapterTarget(
         qicorerelatedpersonAdapter param);

   public boolean hasLanguage();

   public boolean hasLanguageElement();

   public CodeType getLanguageElement();

   public String getLanguage();

   public Iqicoremedicationstatement setLanguageElement(CodeType param);

   public Iqicoremedicationstatement setLanguage(String param);

   public boolean hasSubject();

   public Reference getSubject();

   public Iqicoremedicationstatement setSubject(Reference param);

   public Patient getSubjectTarget();

   public Iqicoremedicationstatement setSubjectTarget(Resource param);

   public qicorepatientAdapter getSubjectAdapterTarget();

   public Iqicoremedicationstatement setSubjectAdapterTarget(
         qicorepatientAdapter param);

   public boolean hasStatus();

   public boolean hasStatusElement();

   public MedicationStatement.MedicationStatementStatus getStatus();

   public Enumeration<MedicationStatement.MedicationStatementStatus> getStatusElement();

   public Iqicoremedicationstatement setStatus(
         MedicationStatement.MedicationStatementStatus param);

   public Iqicoremedicationstatement setStatusElement(
         Enumeration<MedicationStatement.MedicationStatementStatus> param);

   public Type getEffective();

   public Iqicoremedicationstatement setEffective(Type param);

   public DateTimeType getEffectiveDateTimeType();

   public boolean hasEffectiveDateTimeType();

   public Period getEffectivePeriod();

   public boolean hasEffectivePeriod();

   public List<Resource> getContained();

   public Iqicoremedicationstatement setContained(List<Resource> param);

   public boolean hasContained();

   public Iqicoremedicationstatement addContained(Resource param);

   public List<CodeableConcept> getReasonNotTaken();

   public Iqicoremedicationstatement setReasonNotTaken(
         List<CodeableConcept> param);

   public boolean hasReasonNotTaken();

   public Iqicoremedicationstatement addReasonNotTaken(CodeableConcept param);

   public CodeableConcept addReasonNotTaken();

   public Type getMedication();

   public Iqicoremedicationstatement setMedication(Type param);

   public CodeableConcept getMedicationCodeableConcept();

   public boolean hasMedicationCodeableConcept();

   public boolean hasMedication();

   public Reference getMedicationReference();

   public Medication getMedicationTarget();

   public Iqicoremedicationstatement setMedication(Reference param);

   public Iqicoremedicationstatement setMedicationTarget(Medication param);

   public boolean hasDerivedFrom();

   public List<Reference> getDerivedFrom();

   public boolean hasNotTaken();

   public boolean hasNotTakenElement();

   public Enumeration<MedicationStatementNotTaken> getNotTakenElement();

   public MedicationStatementNotTaken getNotTaken();

   public Iqicoremedicationstatement setNotTakenElement(Enumeration<MedicationStatementNotTaken> param);

   public Iqicoremedicationstatement setNotTaken(MedicationStatementNotTaken  param);
}