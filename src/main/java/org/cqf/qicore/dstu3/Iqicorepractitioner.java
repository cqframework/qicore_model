package org.cqf.qicore.dstu3;

import org.hl7.fhir.dstu3.model.Practitioner;
import org.hl7.fhir.dstu3.model.*;

import java.util.List;

import org.hl7.fhir.dstu3.model.BooleanType;

import java.lang.Boolean;

import org.hl7.fhir.dstu3.model.ContactPoint;
import org.hl7.fhir.dstu3.model.HumanName;
import org.hl7.fhir.dstu3.model.CodeType;

import java.lang.String;

import org.hl7.fhir.dstu3.model.CodeableConcept;
import org.hl7.fhir.dstu3.model.DateType;

import java.util.Date;

import org.hl7.fhir.dstu3.model.Address;
import org.hl7.fhir.dstu3.model.IdType;
import org.hl7.fhir.dstu3.model.Attachment;
import org.hl7.fhir.dstu3.model.Enumeration;
import org.hl7.fhir.dstu3.model.UriType;
import org.hl7.fhir.dstu3.model.Identifier;
import org.hl7.fhir.dstu3.model.Resource;

public interface Iqicorepractitioner
{

   public Practitioner getAdaptee();

   public void setAdaptee(Practitioner param);

   public boolean hasActive();

   public boolean hasActiveElement();

   public BooleanType getActiveElement();

   public Boolean getActive();

   public Iqicorepractitioner setActiveElement(BooleanType param);

   public Iqicorepractitioner setActive(Boolean param);

   public List<ContactPoint> getTelecom();

   public Iqicorepractitioner setTelecom(List<ContactPoint> param);

   public boolean hasTelecom();

   public Iqicorepractitioner addTelecom(ContactPoint param);

   public ContactPoint addTelecom();

   public List<Practitioner.PractitionerQualificationComponent> getQualification();

   public qicorepractitionerAdapter setQualification(
         List<Practitioner.PractitionerQualificationComponent> param);

   public boolean hasQualification();

   public qicorepractitionerAdapter addQualification(
         Practitioner.PractitionerQualificationComponent param);

   public Practitioner.PractitionerQualificationComponent addQualification();

   public List<HumanName> getName();

   public Iqicorepractitioner setName(List<HumanName> param);

   public boolean hasName();

   public Iqicorepractitioner addName(HumanName param);

   public HumanName addName();

   public boolean hasLanguage();

   public boolean hasLanguageElement();

   public CodeType getLanguageElement();

   public String getLanguage();

   public Iqicorepractitioner setLanguageElement(CodeType param);

   public Iqicorepractitioner setLanguage(String param);

   public CodeableConcept getClassification();

   public Iqicorepractitioner setClassification(CodeableConcept param);

   public boolean hasBirthDate();

   public boolean hasBirthDateElement();

   public DateType getBirthDateElement();

   public Date getBirthDate();

   public Iqicorepractitioner setBirthDateElement(DateType param);

   public Iqicorepractitioner setBirthDate(Date param);

   public List<CodeableConcept> getCommunication();

   public Iqicorepractitioner setCommunication(List<CodeableConcept> param);

   public boolean hasCommunication();

   public Iqicorepractitioner addCommunication(CodeableConcept param);

   public CodeableConcept addCommunication();

   public List<Address> getAddress();

   public Iqicorepractitioner setAddress(List<Address> param);

   public boolean hasAddress();

   public Iqicorepractitioner addAddress(Address param);

   public Address addAddress();

   public boolean hasId();

   public boolean hasIdElement();

   public IdType getIdElement();

   public String getId();

   public Iqicorepractitioner setIdElement(IdType param);

   public Iqicorepractitioner setId(String param);

   public List<Attachment> getPhoto();

   public Iqicorepractitioner setPhoto(List<Attachment> param);

   public boolean hasPhoto();

   public Iqicorepractitioner addPhoto(Attachment param);

   public Attachment addPhoto();

   public boolean hasGender();

   public boolean hasGenderElement();

   public Enumerations.AdministrativeGender getGender();

   public Enumeration<Enumerations.AdministrativeGender> getGenderElement();

   public Iqicorepractitioner setGender(Enumerations.AdministrativeGender param);

   public Iqicorepractitioner setGenderElement(
         Enumeration<Enumerations.AdministrativeGender> param);

   public boolean hasImplicitRules();

   public boolean hasImplicitRulesElement();

   public UriType getImplicitRulesElement();

   public String getImplicitRules();

   public Iqicorepractitioner setImplicitRulesElement(UriType param);

   public Iqicorepractitioner setImplicitRules(String param);

   public List<Identifier> getIdentifier();

   public Iqicorepractitioner setIdentifier(List<Identifier> param);

   public boolean hasIdentifier();

   public Iqicorepractitioner addIdentifier(Identifier param);

   public Identifier addIdentifier();

   public List<Resource> getContained();

   public Iqicorepractitioner setContained(List<Resource> param);

   public boolean hasContained();

   public Iqicorepractitioner addContained(Resource param);
}
