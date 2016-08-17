package org.socraticgrid.fhir.generated;

import org.socraticgrid.fhir.generated.IQICorePractitioner;
import ca.uhn.fhir.model.dstu2.resource.Practitioner;
import java.util.List;
import ca.uhn.fhir.model.primitive.BooleanDt;
import ca.uhn.fhir.model.dstu2.composite.ContactPointDt;
import ca.uhn.fhir.model.dstu2.composite.HumanNameDt;
import ca.uhn.fhir.model.primitive.CodeDt;
import ca.uhn.fhir.model.dstu2.composite.CodeableConceptDt;
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

public class QICorePractitionerAdapter implements IQICorePractitioner
{

   private Practitioner adaptedClass = null;

   public QICorePractitionerAdapter()
   {
      this.adaptedClass = new ca.uhn.fhir.model.dstu2.resource.Practitioner();
   }

   public QICorePractitionerAdapter(Practitioner adaptee)
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

   public List<Practitioner.PractitionerRole> getPractitionerRole()
   {
      return adaptedClass.getPractitionerRole();
   }

   public IQICorePractitioner setPractitionerRole(
         List<Practitioner.PractitionerRole> param)
   {
      adaptedClass.setPractitionerRole(param);
      return this;
   }

   public IQICorePractitioner addPractitionerRole(
         Practitioner.PractitionerRole param)
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

   public BooleanDt getActiveElement()
   {
      return adaptedClass.getActiveElement();
   }

   public Boolean getActive()
   {
      return adaptedClass.getActive();
   }

   public IQICorePractitioner setActive(Boolean param)
   {
      adaptedClass
            .setActive(new ca.uhn.fhir.model.primitive.BooleanDt(param));
      return this;
   }

   public IQICorePractitioner setActive(BooleanDt param)
   {
      adaptedClass.setActive(param);
      return this;
   }

   public List<ContactPointDt> getTelecom()
   {
      return adaptedClass.getTelecom();
   }

   public IQICorePractitioner setTelecom(List<ContactPointDt> param)
   {
      adaptedClass.setTelecom(param);
      return this;
   }

   public IQICorePractitioner addTelecom(ContactPointDt param)
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

   public IQICorePractitioner setQualification(
         List<Practitioner.Qualification> param)
   {
      adaptedClass.setQualification(param);
      return this;
   }

   public IQICorePractitioner addQualification(Practitioner.Qualification param)
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

   public IQICorePractitioner setName(HumanNameDt param)
   {
      adaptedClass.setName(param);
      return this;
   }

   public CodeDt getLanguage()
   {
      return adaptedClass.getLanguage();
   }

   public IQICorePractitioner setLanguage(CodeDt param)
   {
      adaptedClass.setLanguage(param);
      return this;
   }

   public CodeableConceptDt getClassification()
   {
      List<ca.uhn.fhir.model.api.ExtensionDt> extensions = adaptedClass
            .getUndeclaredExtensionsByUrl("http://hl7.org/fhir/StructureDefinition/practitioner-classification");
      if (extensions == null || extensions.size() <= 0)
      {
         return null;
      }
      else if (extensions.size() == 1)
      {
         return (ca.uhn.fhir.model.dstu2.composite.CodeableConceptDt) extensions
               .get(0).getValue();
      }
      else
      {
         throw new RuntimeException(
               "More than one extension exists for classification");
      }
   }

   public IQICorePractitioner setClassification(CodeableConceptDt param)
   {
      adaptedClass
            .addUndeclaredExtension(
                  false,
                  "http://hl7.org/fhir/StructureDefinition/practitioner-classification",
                  param);
      return this;
   }

   public NarrativeDt getText()
   {
      return adaptedClass.getText();
   }

   public IQICorePractitioner setText(NarrativeDt param)
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

   public IQICorePractitioner setBirthDate(Date param)
   {
      adaptedClass
            .setBirthDate(new ca.uhn.fhir.model.primitive.DateDt(param));
      return this;
   }

   public IQICorePractitioner setBirthDate(DateDt param)
   {
      adaptedClass.setBirthDate(param);
      return this;
   }

   public List<AddressDt> getAddress()
   {
      return adaptedClass.getAddress();
   }

   public IQICorePractitioner setAddress(List<AddressDt> param)
   {
      adaptedClass.setAddress(param);
      return this;
   }

   public IQICorePractitioner addAddress(AddressDt param)
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

   public IQICorePractitioner setId(IdDt param)
   {
      adaptedClass.setId(param);
      return this;
   }

   public List<AttachmentDt> getPhoto()
   {
      return adaptedClass.getPhoto();
   }

   public IQICorePractitioner setPhoto(List<AttachmentDt> param)
   {
      adaptedClass.setPhoto(param);
      return this;
   }

   public IQICorePractitioner addPhoto(AttachmentDt param)
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

   public IQICorePractitioner setGender(String param)
   {
      adaptedClass
            .setGender(ca.uhn.fhir.model.dstu2.valueset.AdministrativeGenderEnum
                  .valueOf(param));
      return this;
   }

   public IQICorePractitioner setGender(AdministrativeGenderEnum param)
   {
      adaptedClass.setGender(param);
      return this;
   }

   public BoundCodeDt<AdministrativeGenderEnum> getGenderElement()
   {
      return adaptedClass.getGenderElement();
   }

   public IQICorePractitioner setGender(
         BoundCodeDt<AdministrativeGenderEnum> param)
   {
      adaptedClass.setGender(param);
      return this;
   }

   public List<IdentifierDt> getIdentifier()
   {
      return adaptedClass.getIdentifier();
   }

   public IQICorePractitioner setIdentifier(List<IdentifierDt> param)
   {
      adaptedClass.setIdentifier(param);
      return this;
   }

   public IQICorePractitioner addIdentifier(IdentifierDt param)
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

   public IQICorePractitioner setContained(ContainedDt param)
   {
      adaptedClass.setContained(param);
      return this;
   }
}