package org.cqf.qicore.dstu3;

import org.hl7.fhir.dstu3.model.RelatedPerson;
import org.hl7.fhir.dstu3.model.*;

import java.util.List;

import org.hl7.fhir.dstu3.model.Address;
import org.hl7.fhir.dstu3.model.IdType;

import java.lang.String;

import org.hl7.fhir.dstu3.model.ContactPoint;
import org.hl7.fhir.dstu3.model.UriType;
import org.hl7.fhir.dstu3.model.BooleanType;

import java.lang.Boolean;

import org.hl7.fhir.dstu3.model.Reference;
import org.hl7.fhir.dstu3.model.Patient;
import org.hl7.fhir.dstu3.model.Period;
import org.hl7.fhir.dstu3.model.CodeableConcept;
import org.hl7.fhir.dstu3.model.DateType;

import java.util.Date;

import org.hl7.fhir.dstu3.model.Identifier;
import org.hl7.fhir.dstu3.model.Resource;
import org.hl7.fhir.dstu3.model.HumanName;
import org.hl7.fhir.dstu3.model.Attachment;
import org.hl7.fhir.dstu3.model.CodeType;
import org.hl7.fhir.dstu3.model.Enumeration;

public interface Iqicorerelatedperson
{

   public RelatedPerson getAdaptee();

   public void setAdaptee(RelatedPerson param);

   public List<Address> getAddress();

   public Iqicorerelatedperson setAddress(List<Address> param);

   public boolean hasAddress();

   public Iqicorerelatedperson addAddress(Address param);

   public Address addAddress();

   public boolean hasId();

   public boolean hasIdElement();

   public IdType getIdElement();

   public String getId();

   public Iqicorerelatedperson setIdElement(IdType param);

   public Iqicorerelatedperson setId(String param);

   public List<ContactPoint> getTelecom();

   public Iqicorerelatedperson setTelecom(List<ContactPoint> param);

   public boolean hasTelecom();

   public Iqicorerelatedperson addTelecom(ContactPoint param);

   public ContactPoint addTelecom();

   public boolean hasImplicitRules();

   public boolean hasImplicitRulesElement();

   public UriType getImplicitRulesElement();

   public String getImplicitRules();

   public Iqicorerelatedperson setImplicitRulesElement(UriType param);

   public Iqicorerelatedperson setImplicitRules(String param);

   public boolean hasActive();

   public boolean hasActiveElement();

   public BooleanType getActiveElement();

   public Boolean getActive();

   public Iqicorerelatedperson setActiveElement(BooleanType param);

   public Iqicorerelatedperson setActive(Boolean param);

   public boolean hasPatient();

   public Reference getPatient();

   public Iqicorerelatedperson setPatient(Reference param);

   public Patient getPatientTarget();

   public Iqicorerelatedperson setPatientTarget(Patient param);

   public qicorepatientAdapter getPatientAdapterTarget();

   public Iqicorerelatedperson setPatientAdapterTarget(
         qicorepatientAdapter param);

   public Period getPeriod();

   public Iqicorerelatedperson setPeriod(Period param);

   public boolean hasPeriod();

   public CodeableConcept getRelationship();

   public Iqicorerelatedperson setRelationship(CodeableConcept param);

   public boolean hasRelationship();

   public boolean hasBirthDate();

   public boolean hasBirthDateElement();

   public DateType getBirthDateElement();

   public Date getBirthDate();

   public Iqicorerelatedperson setBirthDateElement(DateType param);

   public Iqicorerelatedperson setBirthDate(Date param);

   public List<Identifier> getIdentifier();

   public Iqicorerelatedperson setIdentifier(List<Identifier> param);

   public boolean hasIdentifier();

   public Iqicorerelatedperson addIdentifier(Identifier param);

   public Identifier addIdentifier();

   public List<Resource> getContained();

   public Iqicorerelatedperson setContained(List<Resource> param);

   public boolean hasContained();

   public Iqicorerelatedperson addContained(Resource param);

   public List<HumanName> getName();

   public Iqicorerelatedperson setName(List<HumanName> param);

   public boolean hasName();

   public Iqicorerelatedperson addName(HumanName param);

   public HumanName addName();

   public List<Attachment> getPhoto();

   public Iqicorerelatedperson setPhoto(List<Attachment> param);

   public boolean hasPhoto();

   public Iqicorerelatedperson addPhoto(Attachment param);

   public Attachment addPhoto();

   public boolean hasLanguage();

   public boolean hasLanguageElement();

   public CodeType getLanguageElement();

   public String getLanguage();

   public Iqicorerelatedperson setLanguageElement(CodeType param);

   public Iqicorerelatedperson setLanguage(String param);

   public boolean hasGender();

   public boolean hasGenderElement();

   public Enumerations.AdministrativeGender getGender();

   public Enumeration<Enumerations.AdministrativeGender> getGenderElement();

   public Iqicorerelatedperson setGender(
         Enumerations.AdministrativeGender param);

   public Iqicorerelatedperson setGenderElement(
         Enumeration<Enumerations.AdministrativeGender> param);
}