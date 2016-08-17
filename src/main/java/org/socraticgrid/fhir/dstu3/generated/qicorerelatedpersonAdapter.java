package org.socraticgrid.fhir.dstu3.generated;

import org.socraticgrid.fhir.dstu3.generated.Iqicorerelatedperson;
import org.hl7.fhir.dstu3.model.RelatedPerson;
import org.hl7.fhir.dstu3.model.Address;
import java.util.List;
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
import org.hl7.fhir.dstu3.model.*;
import ca.uhn.fhir.model.api.ExtensionDt;

public class qicorerelatedpersonAdapter implements Iqicorerelatedperson
{

   private RelatedPerson adaptedClass;

   public qicorerelatedpersonAdapter()
   {
      this.adaptedClass = new org.hl7.fhir.dstu3.model.RelatedPerson();
   }

   public qicorerelatedpersonAdapter(RelatedPerson adaptee)
   {
      this.adaptedClass = adaptee;
   }

   public RelatedPerson getAdaptee()
   {
      return adaptedClass;
   }

   public void setAdaptee(RelatedPerson param)
   {
      this.adaptedClass = param;
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

   public Iqicorerelatedperson setAddress(List<Address> param)
   {
      adaptedClass.setAddress(param);
      return this;
   }

   public boolean hasAddress()
   {
      return adaptedClass.hasAddress();
   }

   public Iqicorerelatedperson addAddress(Address param)
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

   public Iqicorerelatedperson setIdElement(IdType param)
   {
      adaptedClass.setIdElement(param);
      return this;
   }

   public Iqicorerelatedperson setId(String param)
   {
      adaptedClass.setId(param);
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

   public Iqicorerelatedperson setTelecom(List<ContactPoint> param)
   {
      adaptedClass.setTelecom(param);
      return this;
   }

   public boolean hasTelecom()
   {
      return adaptedClass.hasTelecom();
   }

   public Iqicorerelatedperson addTelecom(ContactPoint param)
   {
      adaptedClass.addTelecom(param);
      return this;
   }

   public ContactPoint addTelecom()
   {
      return adaptedClass.addTelecom();
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

   public Iqicorerelatedperson setImplicitRulesElement(UriType param)
   {
      adaptedClass.setImplicitRulesElement(param);
      return this;
   }

   public Iqicorerelatedperson setImplicitRules(String param)
   {
      adaptedClass.setImplicitRules(param);
      return this;
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

   public Iqicorerelatedperson setActiveElement(BooleanType param)
   {
      adaptedClass.setActiveElement(param);
      return this;
   }

   public Iqicorerelatedperson setActive(Boolean param)
   {
      adaptedClass.setActive(param);
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

   public Iqicorerelatedperson setPatient(Reference param)
   {
      adaptedClass.setPatient(param);
      return this;
   }

   public Patient getPatientTarget()
   {
      return (org.hl7.fhir.dstu3.model.Patient) adaptedClass
            .getPatientTarget();
   }

   public Iqicorerelatedperson setPatientTarget(Patient param)
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

   public Iqicorerelatedperson setPatientAdapterTarget(
         qicorepatientAdapter param)
   {
      adaptedClass.setPatientTarget(param.getAdaptee());
      return this;
   }

   public Period getPeriod()
   {
      try
      {
         return adaptedClass.getPeriod();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Period", e);
      }
   }

   public Iqicorerelatedperson setPeriod(Period param)
   {
      adaptedClass.setPeriod(param);
      return this;
   }

   public boolean hasPeriod()
   {
      return adaptedClass.hasPeriod();
   }

   public CodeableConcept getRelationship()
   {
      try
      {
         return adaptedClass.getRelationship();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Relationship", e);
      }
   }

   public Iqicorerelatedperson setRelationship(CodeableConcept param)
   {
      adaptedClass.setRelationship(param);
      return this;
   }

   public boolean hasRelationship()
   {
      return adaptedClass.hasRelationship();
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

   public Iqicorerelatedperson setBirthDateElement(DateType param)
   {
      adaptedClass.setBirthDateElement(param);
      return this;
   }

   public Iqicorerelatedperson setBirthDate(Date param)
   {
      adaptedClass.setBirthDate(param);
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

   public Iqicorerelatedperson setIdentifier(List<Identifier> param)
   {
      adaptedClass.setIdentifier(param);
      return this;
   }

   public boolean hasIdentifier()
   {
      return adaptedClass.hasIdentifier();
   }

   public Iqicorerelatedperson addIdentifier(Identifier param)
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

   public Iqicorerelatedperson setContained(List<Resource> param)
   {
      adaptedClass.setContained(param);
      return this;
   }

   public boolean hasContained()
   {
      return adaptedClass.hasContained();
   }

   public Iqicorerelatedperson addContained(Resource param)
   {
      adaptedClass.addContained(param);
      return this;
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

   public Iqicorerelatedperson setName(List<HumanName> param)
   {
      adaptedClass.setName(param);
      return this;
   }

   public boolean hasName()
   {
      return adaptedClass.hasName();
   }

   public Iqicorerelatedperson addName(HumanName param)
   {
      adaptedClass.addName(param);
      return this;
   }

   public HumanName addName()
   {
      return adaptedClass.addName();
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

   public Iqicorerelatedperson setPhoto(List<Attachment> param)
   {
      adaptedClass.setPhoto(param);
      return this;
   }

   public boolean hasPhoto()
   {
      return adaptedClass.hasPhoto();
   }

   public Iqicorerelatedperson addPhoto(Attachment param)
   {
      adaptedClass.addPhoto(param);
      return this;
   }

   public Attachment addPhoto()
   {
      return adaptedClass.addPhoto();
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

   public Iqicorerelatedperson setLanguageElement(CodeType param)
   {
      adaptedClass.setLanguageElement(param);
      return this;
   }

   public Iqicorerelatedperson setLanguage(String param)
   {
      adaptedClass.setLanguage(param);
      return this;
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

   public Iqicorerelatedperson setGender(
         Enumerations.AdministrativeGender param)
   {
      adaptedClass.setGender(param);
      return this;
   }

   public Iqicorerelatedperson setGenderElement(
         Enumeration<Enumerations.AdministrativeGender> param)
   {
      adaptedClass.setGenderElement(param);
      return this;
   }
}