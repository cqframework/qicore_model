package org.socraticgrid.fhir.generated;

import org.socraticgrid.fhir.generated.IPatient;
import ca.uhn.fhir.model.dstu2.resource.Patient;
import java.util.List;
import ca.uhn.fhir.model.dstu2.composite.AttachmentDt;
import ca.uhn.fhir.model.dstu2.composite.NarrativeDt;
import ca.uhn.fhir.model.dstu2.valueset.AdministrativeGenderEnum;
import ca.uhn.fhir.model.primitive.BoundCodeDt;
import ca.uhn.fhir.model.primitive.BooleanDt;
import ca.uhn.fhir.model.primitive.DateTimeDt;
import java.util.Date;
import ca.uhn.fhir.model.dstu2.valueset.MaritalStatusCodesEnum;
import ca.uhn.fhir.model.dstu2.composite.BoundCodeableConceptDt;
import ca.uhn.fhir.model.dstu2.resource.Organization;
import ca.uhn.fhir.model.primitive.DateDt;
import ca.uhn.fhir.model.primitive.CodeDt;
import ca.uhn.fhir.model.dstu2.composite.ContactPointDt;
import ca.uhn.fhir.model.dstu2.composite.AddressDt;
import ca.uhn.fhir.model.dstu2.composite.IdentifierDt;
import ca.uhn.fhir.model.primitive.IdDt;
import ca.uhn.fhir.model.dstu2.composite.HumanNameDt;
import ca.uhn.fhir.model.dstu2.composite.ContainedDt;
import ca.uhn.fhir.model.primitive.IntegerDt;
import ca.uhn.fhir.model.api.ExtensionDt;
import ca.uhn.fhir.model.dstu2.resource.*;

public class PatientAdapter implements IPatient
{

   private Patient adaptedClass = null;

   public PatientAdapter()
   {
      this.adaptedClass = new ca.uhn.fhir.model.dstu2.resource.Patient();
   }

   public PatientAdapter(Patient adaptee)
   {
      this.adaptedClass = adaptee;
   }

   public Patient getAdaptee()
   {
      return adaptedClass;
   }

   public void setAdaptee(Patient param)
   {
      this.adaptedClass = param;
   }

   public List<AttachmentDt> getPhoto()
   {
      return adaptedClass.getPhoto();
   }

   public IPatient setPhoto(List<AttachmentDt> param)
   {
      adaptedClass.setPhoto(param);
      return this;
   }

   public IPatient addPhoto(AttachmentDt param)
   {
      adaptedClass.addPhoto(param);
      return this;
   }

   public AttachmentDt addPhoto()
   {
      ca.uhn.fhir.model.dstu2.composite.AttachmentDt item = new ca.uhn.fhir.model.dstu2.composite.AttachmentDt();
      adaptedClass.addPhoto(item);
      return item;
   }

   public AttachmentDt getPhotoFirstRep()
   {
      return adaptedClass.getPhotoFirstRep();
   }

   public List<Patient.Contact> getContact()
   {
      return adaptedClass.getContact();
   }

   public IPatient setContact(List<Patient.Contact> param)
   {
      adaptedClass.setContact(param);
      return this;
   }

   public IPatient addContact(Patient.Contact param)
   {
      adaptedClass.addContact(param);
      return this;
   }

   public Patient.Contact addContact()
   {
      ca.uhn.fhir.model.dstu2.resource.Patient.Contact item = new ca.uhn.fhir.model.dstu2.resource.Patient.Contact();
      adaptedClass.addContact(item);
      return item;
   }

   public Patient.Contact getContactFirstRep()
   {
      return adaptedClass.getContactFirstRep();
   }

   public List<Patient.Communication> getCommunication()
   {
      return adaptedClass.getCommunication();
   }

   public IPatient setCommunication(List<Patient.Communication> param)
   {
      adaptedClass.setCommunication(param);
      return this;
   }

   public IPatient addCommunication(Patient.Communication param)
   {
      adaptedClass.addCommunication(param);
      return this;
   }

   public Patient.Communication addCommunication()
   {
      ca.uhn.fhir.model.dstu2.resource.Patient.Communication item = new ca.uhn.fhir.model.dstu2.resource.Patient.Communication();
      adaptedClass.addCommunication(item);
      return item;
   }

   public Patient.Communication getCommunicationFirstRep()
   {
      return adaptedClass.getCommunicationFirstRep();
   }

   public NarrativeDt getText()
   {
      return adaptedClass.getText();
   }

   public IPatient setText(NarrativeDt param)
   {
      adaptedClass.setText(param);
      return this;
   }

   public String getGender()
   {
      return adaptedClass.getGender();
   }

   public IPatient setGender(String param)
   {
      adaptedClass
            .setGender(ca.uhn.fhir.model.dstu2.valueset.AdministrativeGenderEnum
                  .valueOf(param));
      return this;
   }

   public IPatient setGender(AdministrativeGenderEnum param)
   {
      adaptedClass.setGender(param);
      return this;
   }

   public BoundCodeDt<AdministrativeGenderEnum> getGenderElement()
   {
      return adaptedClass.getGenderElement();
   }

   public IPatient setGender(BoundCodeDt<AdministrativeGenderEnum> param)
   {
      adaptedClass.setGender(param);
      return this;
   }

   public Patient.Animal getAnimal()
   {
      return adaptedClass.getAnimal();
   }

   public IPatient setAnimal(Patient.Animal param)
   {
      adaptedClass.setAnimal(param);
      return this;
   }

   public BooleanDt getDeceasedBooleanElement()
   {
      if (adaptedClass.getDeceased() != null
            && adaptedClass.getDeceased() instanceof ca.uhn.fhir.model.primitive.BooleanDt)
      {
         return (ca.uhn.fhir.model.primitive.BooleanDt) adaptedClass
               .getDeceased();
      }
      else
      {
         return null;
      }
   }

   public Boolean getDeceasedBoolean()
   {
      if (adaptedClass.getDeceased() != null
            && adaptedClass.getDeceased() instanceof ca.uhn.fhir.model.primitive.BooleanDt)
      {
         return ((ca.uhn.fhir.model.primitive.BooleanDt) adaptedClass
               .getDeceased()).getValue();
      }
      else
      {
         return null;
      }
   }

   public IPatient setDeceasedBoolean(BooleanDt param)
   {
      adaptedClass.setDeceased(param);
      return this;
   }

   public IPatient setDeceasedBoolean(Boolean param)
   {
      adaptedClass.setDeceased(new ca.uhn.fhir.model.primitive.BooleanDt(
            param));
      return this;
   }

   public DateTimeDt getDeceasedDateTimeElement()
   {
      if (adaptedClass.getDeceased() != null
            && adaptedClass.getDeceased() instanceof ca.uhn.fhir.model.primitive.DateTimeDt)
      {
         return (ca.uhn.fhir.model.primitive.DateTimeDt) adaptedClass
               .getDeceased();
      }
      else
      {
         return null;
      }
   }

   public Date getDeceasedDateTime()
   {
      if (adaptedClass.getDeceased() != null
            && adaptedClass.getDeceased() instanceof ca.uhn.fhir.model.primitive.DateTimeDt)
      {
         return ((ca.uhn.fhir.model.primitive.DateTimeDt) adaptedClass
               .getDeceased()).getValue();
      }
      else
      {
         return null;
      }
   }

   public IPatient setDeceasedDateTime(DateTimeDt param)
   {
      adaptedClass.setDeceased(param);
      return this;
   }

   public IPatient setDeceasedDateTime(Date param)
   {
      adaptedClass.setDeceased(new ca.uhn.fhir.model.primitive.DateTimeDt(
            param));
      return this;
   }

   public BoundCodeableConceptDt<MaritalStatusCodesEnum> getMaritalStatus()
   {
      return adaptedClass.getMaritalStatus();
   }

   public IPatient setMaritalStatus(
         BoundCodeableConceptDt<MaritalStatusCodesEnum> param)
   {
      adaptedClass.setMaritalStatus(param);
      return this;
   }

   public Organization getManagingOrganizationResource()
   {
      if (adaptedClass.getManagingOrganization().getResource() instanceof ca.uhn.fhir.model.dstu2.resource.Organization)
      {
         return (ca.uhn.fhir.model.dstu2.resource.Organization) adaptedClass
               .getManagingOrganization().getResource();
      }
      else
      {
         return null;
      }
   }

   public IPatient setManagingOrganizationResource(Organization param)
   {
      adaptedClass.getManagingOrganization().setResource(param);
      return this;
   }

   public DateDt getBirthDateElement()
   {
      return adaptedClass.getBirthDateElement();
   }

   public Date getBirthDate()
   {
      return adaptedClass.getBirthDate();
   }

   public IPatient setBirthDate(Date param)
   {
      adaptedClass
            .setBirthDate(new ca.uhn.fhir.model.primitive.DateDt(param));
      return this;
   }

   public IPatient setBirthDate(DateDt param)
   {
      adaptedClass.setBirthDate(param);
      return this;
   }

   public CodeDt getLanguage()
   {
      return adaptedClass.getLanguage();
   }

   public IPatient setLanguage(CodeDt param)
   {
      adaptedClass.setLanguage(param);
      return this;
   }

   public List<Patient.Link> getLink()
   {
      return adaptedClass.getLink();
   }

   public IPatient setLink(List<Patient.Link> param)
   {
      adaptedClass.setLink(param);
      return this;
   }

   public IPatient addLink(Patient.Link param)
   {
      adaptedClass.addLink(param);
      return this;
   }

   public Patient.Link addLink()
   {
      ca.uhn.fhir.model.dstu2.resource.Patient.Link item = new ca.uhn.fhir.model.dstu2.resource.Patient.Link();
      adaptedClass.addLink(item);
      return item;
   }

   public Patient.Link getLinkFirstRep()
   {
      return adaptedClass.getLinkFirstRep();
   }

   public List<ContactPointDt> getTelecom()
   {
      return adaptedClass.getTelecom();
   }

   public IPatient setTelecom(List<ContactPointDt> param)
   {
      adaptedClass.setTelecom(param);
      return this;
   }

   public IPatient addTelecom(ContactPointDt param)
   {
      adaptedClass.addTelecom(param);
      return this;
   }

   public ContactPointDt addTelecom()
   {
      ca.uhn.fhir.model.dstu2.composite.ContactPointDt item = new ca.uhn.fhir.model.dstu2.composite.ContactPointDt();
      adaptedClass.addTelecom(item);
      return item;
   }

   public ContactPointDt getTelecomFirstRep()
   {
      return adaptedClass.getTelecomFirstRep();
   }

   public List<AddressDt> getAddress()
   {
      return adaptedClass.getAddress();
   }

   public IPatient setAddress(List<AddressDt> param)
   {
      adaptedClass.setAddress(param);
      return this;
   }

   public IPatient addAddress(AddressDt param)
   {
      adaptedClass.addAddress(param);
      return this;
   }

   public AddressDt addAddress()
   {
      ca.uhn.fhir.model.dstu2.composite.AddressDt item = new ca.uhn.fhir.model.dstu2.composite.AddressDt();
      adaptedClass.addAddress(item);
      return item;
   }

   public AddressDt getAddressFirstRep()
   {
      return adaptedClass.getAddressFirstRep();
   }

   public BooleanDt getActiveElement()
   {
      return adaptedClass.getActiveElement();
   }

   public Boolean getActive()
   {
      return adaptedClass.getActive();
   }

   public IPatient setActive(Boolean param)
   {
      adaptedClass
            .setActive(new ca.uhn.fhir.model.primitive.BooleanDt(param));
      return this;
   }

   public IPatient setActive(BooleanDt param)
   {
      adaptedClass.setActive(param);
      return this;
   }

   public List<IdentifierDt> getIdentifier()
   {
      return adaptedClass.getIdentifier();
   }

   public IPatient setIdentifier(List<IdentifierDt> param)
   {
      adaptedClass.setIdentifier(param);
      return this;
   }

   public IPatient addIdentifier(IdentifierDt param)
   {
      adaptedClass.addIdentifier(param);
      return this;
   }

   public IdentifierDt addIdentifier()
   {
      ca.uhn.fhir.model.dstu2.composite.IdentifierDt item = new ca.uhn.fhir.model.dstu2.composite.IdentifierDt();
      adaptedClass.addIdentifier(item);
      return item;
   }

   public IdentifierDt getIdentifierFirstRep()
   {
      return adaptedClass.getIdentifierFirstRep();
   }

   public IdDt getId()
   {
      return adaptedClass.getId();
   }

   public IPatient setId(IdDt param)
   {
      adaptedClass.setId(param);
      return this;
   }

   public List<HumanNameDt> getName()
   {
      return adaptedClass.getName();
   }

   public IPatient setName(List<HumanNameDt> param)
   {
      adaptedClass.setName(param);
      return this;
   }

   public IPatient addName(HumanNameDt param)
   {
      adaptedClass.addName(param);
      return this;
   }

   public HumanNameDt addName()
   {
      ca.uhn.fhir.model.dstu2.composite.HumanNameDt item = new ca.uhn.fhir.model.dstu2.composite.HumanNameDt();
      adaptedClass.addName(item);
      return item;
   }

   public HumanNameDt getNameFirstRep()
   {
      return adaptedClass.getNameFirstRep();
   }

   public ContainedDt getContained()
   {
      return adaptedClass.getContained();
   }

   public IPatient setContained(ContainedDt param)
   {
      adaptedClass.setContained(param);
      return this;
   }

   public BooleanDt getMultipleBirthBooleanElement()
   {
      if (adaptedClass.getMultipleBirth() != null
            && adaptedClass.getMultipleBirth() instanceof ca.uhn.fhir.model.primitive.BooleanDt)
      {
         return (ca.uhn.fhir.model.primitive.BooleanDt) adaptedClass
               .getMultipleBirth();
      }
      else
      {
         return null;
      }
   }

   public Boolean getMultipleBirthBoolean()
   {
      if (adaptedClass.getMultipleBirth() != null
            && adaptedClass.getMultipleBirth() instanceof ca.uhn.fhir.model.primitive.BooleanDt)
      {
         return ((ca.uhn.fhir.model.primitive.BooleanDt) adaptedClass
               .getMultipleBirth()).getValue();
      }
      else
      {
         return null;
      }
   }

   public IPatient setMultipleBirthBoolean(BooleanDt param)
   {
      adaptedClass.setMultipleBirth(param);
      return this;
   }

   public IPatient setMultipleBirthBoolean(Boolean param)
   {
      adaptedClass
            .setMultipleBirth(new ca.uhn.fhir.model.primitive.BooleanDt(
                  param));
      return this;
   }

   public IntegerDt getMultipleBirthIntegerElement()
   {
      if (adaptedClass.getMultipleBirth() != null
            && adaptedClass.getMultipleBirth() instanceof ca.uhn.fhir.model.primitive.IntegerDt)
      {
         return (ca.uhn.fhir.model.primitive.IntegerDt) adaptedClass
               .getMultipleBirth();
      }
      else
      {
         return null;
      }
   }

   public Integer getMultipleBirthInteger()
   {
      if (adaptedClass.getMultipleBirth() != null
            && adaptedClass.getMultipleBirth() instanceof ca.uhn.fhir.model.primitive.IntegerDt)
      {
         return ((ca.uhn.fhir.model.primitive.IntegerDt) adaptedClass
               .getMultipleBirth()).getValue();
      }
      else
      {
         return null;
      }
   }

   public IPatient setMultipleBirthInteger(IntegerDt param)
   {
      adaptedClass.setMultipleBirth(param);
      return this;
   }

   public IPatient setMultipleBirthInteger(Integer param)
   {
      adaptedClass
            .setMultipleBirth(new ca.uhn.fhir.model.primitive.IntegerDt(
                  param));
      return this;
   }
}