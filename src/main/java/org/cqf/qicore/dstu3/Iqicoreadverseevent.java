package org.cqf.qicore.dstu3;

import org.hl7.fhir.dstu3.model.Basic;

import java.util.List;

import org.hl7.fhir.dstu3.model.Reference;
import org.hl7.fhir.dstu3.model.Resource;
import org.hl7.fhir.dstu3.model.Patient;
import org.hl7.fhir.dstu3.model.RelatedPerson;
import org.hl7.fhir.dstu3.model.Practitioner;
import org.hl7.fhir.dstu3.model.BooleanType;
import org.hl7.fhir.dstu3.model.Condition;
import org.hl7.fhir.dstu3.model.CodeableConcept;
import org.hl7.fhir.dstu3.model.Location;
import org.hl7.fhir.dstu3.model.DateType;

import java.util.Date;

import org.hl7.fhir.dstu3.model.Identifier;
import org.hl7.fhir.dstu3.model.Period;
import org.hl7.fhir.dstu3.model.IdType;

import java.lang.String;

import org.hl7.fhir.dstu3.model.CodeType;
import org.hl7.fhir.dstu3.model.StringType;
import org.hl7.fhir.dstu3.model.UriType;

public interface Iqicoreadverseevent
{

   public Basic getAdaptee();

   public void setAdaptee(Basic param);

   public List<qicoreadverseeventCauseAdapter> getCause();

   public Iqicoreadverseevent setCause(
         List<qicoreadverseeventCauseAdapter> param);

   public Reference getAuthor();

   public Resource getAuthorTarget();

   public boolean hasAuthor();

   public Reference getAuthorPatient();

   public Iqicoreadverseevent setAuthor(Reference param);

   public Patient getAuthorPatientTarget();

   public Iqicoreadverseevent setAuthorTarget(Patient param);

   public qicorepatientAdapter getAuthorPatientAdapterTarget();

   public Iqicoreadverseevent setAuthorAdapterTarget(qicorepatientAdapter param);

   public Reference getAuthorRelatedPerson();

   public RelatedPerson getAuthorRelatedPersonTarget();

   public Iqicoreadverseevent setAuthorTarget(RelatedPerson param);

   public qicorerelatedpersonAdapter getAuthorRelatedPersonAdapterTarget();

   public Iqicoreadverseevent setAuthorAdapterTarget(
         qicorerelatedpersonAdapter param);

   public Reference getAuthorPractitioner();

   public Practitioner getAuthorPractitionerTarget();

   public Iqicoreadverseevent setAuthorTarget(Practitioner param);

   public qicorepractitionerAdapter getAuthorPractitionerAdapterTarget();

   public Iqicoreadverseevent setAuthorAdapterTarget(
         qicorepractitionerAdapter param);

   public List<BooleanType> getModifierExtension();

   public Iqicoreadverseevent setModifierExtension(List<BooleanType> param);

   public List<Condition> getReaction();

   public Iqicoreadverseevent setReaction(List<Condition> param);

   public CodeableConcept getCode();

   public Iqicoreadverseevent setCode(CodeableConcept param);

   public boolean hasCode();

   public List<Location> getLocation();

   public Iqicoreadverseevent setLocation(List<Location> param);

   public boolean hasCreated();

   public boolean hasCreatedElement();

   public DateType getCreatedElement();

   public Date getCreated();

   public Iqicoreadverseevent setCreatedElement(DateType param);

   public Iqicoreadverseevent setCreated(Date param);

   public List<CodeableConcept> getType();

   public Iqicoreadverseevent setType(List<CodeableConcept> param);

   public List<Identifier> getIdentifier();

   public Iqicoreadverseevent setIdentifier(List<Identifier> param);

   public boolean hasIdentifier();

   public Iqicoreadverseevent addIdentifier(Identifier param);

   public Identifier addIdentifier();

   public List<Period> getPeriod();

   public Iqicoreadverseevent setPeriod(List<Period> param);

   public boolean hasId();

   public boolean hasIdElement();

   public IdType getIdElement();

   public String getId();

   public Iqicoreadverseevent setIdElement(IdType param);

   public Iqicoreadverseevent setId(String param);

   public List<CodeType> getSeverity();

   public Iqicoreadverseevent setSeverity(List<CodeType> param);

   public List<StringType> getClinicalStudy();

   public Iqicoreadverseevent setClinicalStudy(List<StringType> param);

   public List<CodeType> getCategory();

   public Iqicoreadverseevent setCategory(List<CodeType> param);

   public boolean hasImplicitRules();

   public boolean hasImplicitRulesElement();

   public UriType getImplicitRulesElement();

   public String getImplicitRules();

   public Iqicoreadverseevent setImplicitRulesElement(UriType param);

   public Iqicoreadverseevent setImplicitRules(String param);

   public boolean hasLanguage();

   public boolean hasLanguageElement();

   public CodeType getLanguageElement();

   public String getLanguage();

   public Iqicoreadverseevent setLanguageElement(CodeType param);

   public Iqicoreadverseevent setLanguage(String param);

   public boolean hasSubject();

   public Reference getSubject();

   public Iqicoreadverseevent setSubject(Reference param);

   public Patient getSubjectTarget();

   public Iqicoreadverseevent setSubjectTarget(Patient param);

   public qicorepatientAdapter getSubjectAdapterTarget();

   public Iqicoreadverseevent setSubjectAdapterTarget(
         qicorepatientAdapter param);

   public List<Resource> getContained();

   public Iqicoreadverseevent setContained(List<Resource> param);

   public boolean hasContained();

   public Iqicoreadverseevent addContained(Resource param);
}