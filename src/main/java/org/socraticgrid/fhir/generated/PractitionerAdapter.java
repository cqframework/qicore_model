package org.socraticgrid.fhir.generated;

import org.socraticgrid.fhir.generated.IPractitioner;
import ca.uhn.fhir.model.dstu2.resource.Practitioner;
import ca.uhn.fhir.model.primitive.BooleanDt;
import java.util.List;
import ca.uhn.fhir.model.dstu2.composite.ContactPointDt;
import ca.uhn.fhir.model.dstu2.composite.HumanNameDt;
import ca.uhn.fhir.model.primitive.CodeDt;
import ca.uhn.fhir.model.dstu2.composite.NarrativeDt;
import ca.uhn.fhir.model.primitive.DateDt;
import java.util.Date;
import ca.uhn.fhir.model.dstu2.composite.AddressDt;
import ca.uhn.fhir.model.primitive.IdDt;
import ca.uhn.fhir.model.dstu2.composite.AttachmentDt;
import ca.uhn.fhir.model.dstu2.valueset.AdministrativeGenderEnum;
import ca.uhn.fhir.model.primitive.BoundCodeDt;
import ca.uhn.fhir.model.dstu2.composite.IdentifierDt;
import ca.uhn.fhir.model.dstu2.composite.ContainedDt;
import ca.uhn.fhir.model.api.ExtensionDt;
import ca.uhn.fhir.model.dstu2.resource.*;

public class PractitionerAdapter implements IPractitioner
{

   private Practitioner adaptedClass = null;

   public PractitionerAdapter()
   {
      this.adaptedClass = new ca.uhn.fhir.model.dstu2.resource.Practitioner();
   }

   public PractitionerAdapter(Practitioner adaptee)
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

   public BooleanDt getActiveElement()
   {
      return adaptedClass.getActiveElement();
   }

   public Boolean getActive()
   {
      return adaptedClass.getActive();
   }

   public IPractitioner setActive(Boolean param)
   {
      adaptedClass
            .setActive(new ca.uhn.fhir.model.primitive.BooleanDt(param));
      return this;
   }

   public IPractitioner setActive(BooleanDt param)
   {
      adaptedClass.setActive(param);
      return this;
   }

   public List<ContactPointDt> getTelecom()
   {
      return adaptedClass.getTelecom();
   }

   public IPractitioner setTelecom(List<ContactPointDt> param)
   {
      adaptedClass.setTelecom(param);
      return this;
   }

   public IPractitioner addTelecom(ContactPointDt param)
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

   public List<Practitioner.Qualification> getQualification()
   {
      return adaptedClass.getQualification();
   }

   public IPractitioner setQualification(List<Practitioner.Qualification> param)
   {
      adaptedClass.setQualification(param);
      return this;
   }

   public IPractitioner addQualification(Practitioner.Qualification param)
   {
      adaptedClass.addQualification(param);
      return this;
   }

   public Practitioner.Qualification addQualification()
   {
      ca.uhn.fhir.model.dstu2.resource.Practitioner.Qualification item = new ca.uhn.fhir.model.dstu2.resource.Practitioner.Qualification();
      adaptedClass.addQualification(item);
      return item;
   }

   public Practitioner.Qualification getQualificationFirstRep()
   {
      return adaptedClass.getQualificationFirstRep();
   }

   public HumanNameDt getName()
   {
      return adaptedClass.getName();
   }

   public IPractitioner setName(HumanNameDt param)
   {
      adaptedClass.setName(param);
      return this;
   }

   public CodeDt getLanguage()
   {
      return adaptedClass.getLanguage();
   }

   public IPractitioner setLanguage(CodeDt param)
   {
      adaptedClass.setLanguage(param);
      return this;
   }

   public NarrativeDt getText()
   {
      return adaptedClass.getText();
   }

   public IPractitioner setText(NarrativeDt param)
   {
      adaptedClass.setText(param);
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

   public IPractitioner setBirthDate(Date param)
   {
      adaptedClass
            .setBirthDate(new ca.uhn.fhir.model.primitive.DateDt(param));
      return this;
   }

   public IPractitioner setBirthDate(DateDt param)
   {
      adaptedClass.setBirthDate(param);
      return this;
   }

   public List<Practitioner.PractitionerRole> getPractitionerRole()
   {
      return adaptedClass.getPractitionerRole();
   }

   public IPractitioner setPractitionerRole(
         List<Practitioner.PractitionerRole> param)
   {
      adaptedClass.setPractitionerRole(param);
      return this;
   }

   public IPractitioner addPractitionerRole(Practitioner.PractitionerRole param)
   {
      adaptedClass.addPractitionerRole(param);
      return this;
   }

   public Practitioner.PractitionerRole addPractitionerRole()
   {
      ca.uhn.fhir.model.dstu2.resource.Practitioner.PractitionerRole item = new ca.uhn.fhir.model.dstu2.resource.Practitioner.PractitionerRole();
      adaptedClass.addPractitionerRole(item);
      return item;
   }

   public Practitioner.PractitionerRole getPractitionerRoleFirstRep()
   {
      return adaptedClass.getPractitionerRoleFirstRep();
   }

   public List<AddressDt> getAddress()
   {
      return adaptedClass.getAddress();
   }

   public IPractitioner setAddress(List<AddressDt> param)
   {
      adaptedClass.setAddress(param);
      return this;
   }

   public IPractitioner addAddress(AddressDt param)
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

   public IdDt getId()
   {
      return adaptedClass.getId();
   }

   public IPractitioner setId(IdDt param)
   {
      adaptedClass.setId(param);
      return this;
   }

   public List<AttachmentDt> getPhoto()
   {
      return adaptedClass.getPhoto();
   }

   public IPractitioner setPhoto(List<AttachmentDt> param)
   {
      adaptedClass.setPhoto(param);
      return this;
   }

   public IPractitioner addPhoto(AttachmentDt param)
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

   public String getGender()
   {
      return adaptedClass.getGender();
   }

   public IPractitioner setGender(String param)
   {
      adaptedClass
            .setGender(ca.uhn.fhir.model.dstu2.valueset.AdministrativeGenderEnum
                  .valueOf(param));
      return this;
   }

   public IPractitioner setGender(AdministrativeGenderEnum param)
   {
      adaptedClass.setGender(param);
      return this;
   }

   public BoundCodeDt<AdministrativeGenderEnum> getGenderElement()
   {
      return adaptedClass.getGenderElement();
   }

   public IPractitioner setGender(BoundCodeDt<AdministrativeGenderEnum> param)
   {
      adaptedClass.setGender(param);
      return this;
   }

   public List<IdentifierDt> getIdentifier()
   {
      return adaptedClass.getIdentifier();
   }

   public IPractitioner setIdentifier(List<IdentifierDt> param)
   {
      adaptedClass.setIdentifier(param);
      return this;
   }

   public IPractitioner addIdentifier(IdentifierDt param)
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

   public ContainedDt getContained()
   {
      return adaptedClass.getContained();
   }

   public IPractitioner setContained(ContainedDt param)
   {
      adaptedClass.setContained(param);
      return this;
   }
}