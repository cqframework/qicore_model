package org.cqf.qicore.dstu3;

import org.hl7.fhir.dstu3.model.Practitioner;
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
import org.hl7.fhir.dstu3.model.*;

public class qicorepractitionerAdapter implements Iqicorepractitioner
{

   private Practitioner adaptedClass;

   public qicorepractitionerAdapter()
   {
      this.adaptedClass = new org.hl7.fhir.dstu3.model.Practitioner();
   }

   public qicorepractitionerAdapter(Practitioner adaptee)
   {
      this.adaptedClass = adaptee;
   }

   public Practitioner getAdaptee()
   {
      return adaptedClass;
   }

   public void setAdaptee(Practitioner param)
   {
      this.adaptedClass = param;
   }

   public List<Practitioner.PractitionerRoleComponent> getRole()
   {
      try
      {
         return adaptedClass.getRole();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Role", e);
      }
   }

   public qicorepractitionerAdapter setRole(
         List<Practitioner.PractitionerRoleComponent> param)
   {
      adaptedClass.setRole(param);
      return this;
   }

   public boolean hasRole()
   {
      return adaptedClass.hasRole();
   }

   public qicorepractitionerAdapter addRole(
         Practitioner.PractitionerRoleComponent param)
   {
      adaptedClass.addRole(param);
      return this;
   }

   public Practitioner.PractitionerRoleComponent addRole()
   {
      return adaptedClass.addRole();
   }

   public boolean hasActive()
   {
      return adaptedClass.hasActive();
   }

   public boolean hasActiveElement()
   {
      return adaptedClass.hasActiveElement();
   }

   public BooleanType getActiveElement()
   {
      try
      {
         return adaptedClass.getActiveElement();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting ActiveElement", e);
      }
   }

   public Boolean getActive()
   {
      try
      {
         return adaptedClass.getActive();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Active", e);
      }
   }

   public Iqicorepractitioner setActiveElement(BooleanType param)
   {
      adaptedClass.setActiveElement(param);
      return this;
   }

   public Iqicorepractitioner setActive(Boolean param)
   {
      adaptedClass.setActive(param);
      return this;
   }

   public List<ContactPoint> getTelecom()
   {
      try
      {
         return adaptedClass.getTelecom();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Telecom", e);
      }
   }

   public Iqicorepractitioner setTelecom(List<ContactPoint> param)
   {
      adaptedClass.setTelecom(param);
      return this;
   }

   public boolean hasTelecom()
   {
      return adaptedClass.hasTelecom();
   }

   public Iqicorepractitioner addTelecom(ContactPoint param)
   {
      adaptedClass.addTelecom(param);
      return this;
   }

   public ContactPoint addTelecom()
   {
      return adaptedClass.addTelecom();
   }

   public List<Practitioner.PractitionerQualificationComponent> getQualification()
   {
      try
      {
         return adaptedClass.getQualification();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Qualification", e);
      }
   }

   public qicorepractitionerAdapter setQualification(
         List<Practitioner.PractitionerQualificationComponent> param)
   {
      adaptedClass.setQualification(param);
      return this;
   }

   public boolean hasQualification()
   {
      return adaptedClass.hasQualification();
   }

   public qicorepractitionerAdapter addQualification(
         Practitioner.PractitionerQualificationComponent param)
   {
      adaptedClass.addQualification(param);
      return this;
   }

   public Practitioner.PractitionerQualificationComponent addQualification()
   {
      return adaptedClass.addQualification();
   }

   public List<HumanName> getName()
   {
      try
      {
         return adaptedClass.getName();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Name", e);
      }
   }

   public Iqicorepractitioner setName(List<HumanName> param)
   {
      adaptedClass.setName(param);
      return this;
   }

   public boolean hasName()
   {
      return adaptedClass.hasName();
   }

   public Iqicorepractitioner addName(HumanName param)
   {
      adaptedClass.addName(param);
      return this;
   }

   public HumanName addName()
   {
      return adaptedClass.addName();
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

   public Iqicorepractitioner setLanguageElement(CodeType param)
   {
      adaptedClass.setLanguageElement(param);
      return this;
   }

   public Iqicorepractitioner setLanguage(String param)
   {
      adaptedClass.setLanguage(param);
      return this;
   }

   public CodeableConcept getClassification()
   {
      List<org.hl7.fhir.dstu3.model.Extension> extensions = adaptedClass
            .getExtensionsByUrl("http://hl7.org/fhir/StructureDefinition/practitioner-classification");
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
               "More than one extension exists for classification");
      }
   }

   public Iqicorepractitioner setClassification(CodeableConcept param)
   {
      adaptedClass
            .addExtension()
            .setUrl("http://hl7.org/fhir/StructureDefinition/practitioner-classification")
            .setValue(param);
      return this;
   }

   public boolean hasBirthDate()
   {
      return adaptedClass.hasBirthDate();
   }

   public boolean hasBirthDateElement()
   {
      return adaptedClass.hasBirthDateElement();
   }

   public DateType getBirthDateElement()
   {
      try
      {
         return adaptedClass.getBirthDateElement();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting BirthDateElement", e);
      }
   }

   public Date getBirthDate()
   {
      try
      {
         return adaptedClass.getBirthDate();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting BirthDate", e);
      }
   }

   public Iqicorepractitioner setBirthDateElement(DateType param)
   {
      adaptedClass.setBirthDateElement(param);
      return this;
   }

   public Iqicorepractitioner setBirthDate(Date param)
   {
      adaptedClass.setBirthDate(param);
      return this;
   }

   public List<CodeableConcept> getCommunication()
   {
      try
      {
         return adaptedClass.getCommunication();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Communication", e);
      }
   }

   public Iqicorepractitioner setCommunication(List<CodeableConcept> param)
   {
      adaptedClass.setCommunication(param);
      return this;
   }

   public boolean hasCommunication()
   {
      return adaptedClass.hasCommunication();
   }

   public Iqicorepractitioner addCommunication(CodeableConcept param)
   {
      adaptedClass.addCommunication(param);
      return this;
   }

   public CodeableConcept addCommunication()
   {
      return adaptedClass.addCommunication();
   }

   public List<Address> getAddress()
   {
      try
      {
         return adaptedClass.getAddress();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Address", e);
      }
   }

   public Iqicorepractitioner setAddress(List<Address> param)
   {
      adaptedClass.setAddress(param);
      return this;
   }

   public boolean hasAddress()
   {
      return adaptedClass.hasAddress();
   }

   public Iqicorepractitioner addAddress(Address param)
   {
      adaptedClass.addAddress(param);
      return this;
   }

   public Address addAddress()
   {
      return adaptedClass.addAddress();
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

   public Iqicorepractitioner setIdElement(IdType param)
   {
      adaptedClass.setIdElement(param);
      return this;
   }

   public Iqicorepractitioner setId(String param)
   {
      adaptedClass.setId(param);
      return this;
   }

   public List<Attachment> getPhoto()
   {
      try
      {
         return adaptedClass.getPhoto();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Photo", e);
      }
   }

   public Iqicorepractitioner setPhoto(List<Attachment> param)
   {
      adaptedClass.setPhoto(param);
      return this;
   }

   public boolean hasPhoto()
   {
      return adaptedClass.hasPhoto();
   }

   public Iqicorepractitioner addPhoto(Attachment param)
   {
      adaptedClass.addPhoto(param);
      return this;
   }

   public Attachment addPhoto()
   {
      return adaptedClass.addPhoto();
   }

   public boolean hasGender()
   {
      return adaptedClass.hasGender();
   }

   public boolean hasGenderElement()
   {
      return adaptedClass.hasGenderElement();
   }

   public Enumerations.AdministrativeGender getGender()
   {
      try
      {
         return adaptedClass.getGender();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Gender", e);
      }
   }

   public Enumeration<Enumerations.AdministrativeGender> getGenderElement()
   {
      try
      {
         return adaptedClass.getGenderElement();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting GenderElement", e);
      }
   }

   public Iqicorepractitioner setGender(Enumerations.AdministrativeGender param)
   {
      adaptedClass.setGender(param);
      return this;
   }

   public Iqicorepractitioner setGenderElement(
         Enumeration<Enumerations.AdministrativeGender> param)
   {
      adaptedClass.setGenderElement(param);
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

   public Iqicorepractitioner setImplicitRulesElement(UriType param)
   {
      adaptedClass.setImplicitRulesElement(param);
      return this;
   }

   public Iqicorepractitioner setImplicitRules(String param)
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

   public Iqicorepractitioner setIdentifier(List<Identifier> param)
   {
      adaptedClass.setIdentifier(param);
      return this;
   }

   public boolean hasIdentifier()
   {
      return adaptedClass.hasIdentifier();
   }

   public Iqicorepractitioner addIdentifier(Identifier param)
   {
      adaptedClass.addIdentifier(param);
      return this;
   }

   public Identifier addIdentifier()
   {
      return adaptedClass.addIdentifier();
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

   public Iqicorepractitioner setContained(List<Resource> param)
   {
      adaptedClass.setContained(param);
      return this;
   }

   public boolean hasContained()
   {
      return adaptedClass.hasContained();
   }

   public Iqicorepractitioner addContained(Resource param)
   {
      adaptedClass.addContained(param);
      return this;
   }
}