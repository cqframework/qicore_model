package org.socraticgrid.fhir.generated;

import org.socraticgrid.fhir.generated.IQICorePatient;
import ca.uhn.fhir.model.dstu2.resource.Patient;
import java.util.List;
import ca.uhn.fhir.model.dstu2.composite.AttachmentDt;
import ca.uhn.fhir.model.dstu2.valueset.AdministrativeGenderEnum;
import ca.uhn.fhir.model.primitive.BoundCodeDt;
import org.socraticgrid.fhir.generated.QICorePatientTelecom;
import ca.uhn.fhir.model.dstu2.composite.ContactPointDt;
import org.socraticgrid.fhir.generated.QICorePatientAddress;
import ca.uhn.fhir.model.dstu2.composite.AddressDt;
import org.socraticgrid.fhir.generated.QICorePatientClinicalTrial;
import ca.uhn.fhir.model.primitive.BooleanDt;
import ca.uhn.fhir.model.primitive.DateTimeDt;
import java.util.Date;
import ca.uhn.fhir.model.primitive.DateDt;
import ca.uhn.fhir.model.dstu2.composite.HumanNameDt;
import ca.uhn.fhir.model.dstu2.composite.CodeableConceptDt;
import org.socraticgrid.fhir.generated.QICorePatientNationality;
import ca.uhn.fhir.model.dstu2.composite.NarrativeDt;
import ca.uhn.fhir.model.dstu2.valueset.MaritalStatusCodesEnum;
import ca.uhn.fhir.model.dstu2.composite.BoundCodeableConceptDt;
import ca.uhn.fhir.model.primitive.CodeDt;
import ca.uhn.fhir.model.dstu2.composite.IdentifierDt;
import ca.uhn.fhir.model.primitive.IdDt;
import ca.uhn.fhir.model.dstu2.composite.ContainedDt;
import ca.uhn.fhir.model.primitive.IntegerDt;
import ca.uhn.fhir.model.api.ExtensionDt;
import ca.uhn.fhir.model.dstu2.resource.*;

public class QICorePatientAdapter implements IQICorePatient
{

   private Patient adaptedClass = null;

   public QICorePatientAdapter()
   {
      this.adaptedClass = new ca.uhn.fhir.model.dstu2.resource.Patient();
   }

   public QICorePatientAdapter(Patient adaptee)
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

   public IQICorePatient setPhoto(List<AttachmentDt> param)
   {
      adaptedClass.setPhoto(param);
      return this;
   }

   public IQICorePatient addPhoto(AttachmentDt param)
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

   public IQICorePatient setContact(List<Patient.Contact> param)
   {
      adaptedClass.setContact(param);
      return this;
   }

   public IQICorePatient addContact(Patient.Contact param)
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

   public String getGender()
   {
      return adaptedClass.getGender();
   }

   public IQICorePatient setGender(String param)
   {
      adaptedClass
            .setGender(ca.uhn.fhir.model.dstu2.valueset.AdministrativeGenderEnum
                  .valueOf(param));
      return this;
   }

   public IQICorePatient setGender(AdministrativeGenderEnum param)
   {
      adaptedClass.setGender(param);
      return this;
   }

   public BoundCodeDt<AdministrativeGenderEnum> getGenderElement()
   {
      return adaptedClass.getGenderElement();
   }

   public IQICorePatient setGender(BoundCodeDt<AdministrativeGenderEnum> param)
   {
      adaptedClass.setGender(param);
      return this;
   }

   public List<QICorePatientTelecom> getWrappedTelecom() {
		List<org.socraticgrid.fhir.generated.QICorePatientTelecom> items = new java.util.ArrayList<>();
		for (ca.uhn.fhir.model.dstu2.composite.ContactPointDt type : adaptedClass
				.getTelecom()) {
			items.add(new org.socraticgrid.fhir.generated.QICorePatientTelecom(
					type));
		}
		return items;
	}

   public IQICorePatient setWrappedTelecom(List<QICorePatientTelecom> param) {
		List<ca.uhn.fhir.model.dstu2.composite.ContactPointDt> items = new java.util.ArrayList<>();
		for (org.socraticgrid.fhir.generated.QICorePatientTelecom item : param) {
			items.add(item.getAdaptee());
		}
		adaptedClass.setTelecom(items);
		return this;
	}

   public IQICorePatient addWrappedTelecom(QICorePatientTelecom param)
   {
      if (param != null)
      {
         adaptedClass.addTelecom(param.getAdaptee());
      }
      return this;
   }

   public QICorePatientTelecom addWrappedTelecom()
   {
      ca.uhn.fhir.model.dstu2.composite.ContactPointDt item = new ca.uhn.fhir.model.dstu2.composite.ContactPointDt();
      adaptedClass.addTelecom(item);
      return new org.socraticgrid.fhir.generated.QICorePatientTelecom(item);
   }

   public QICorePatientTelecom getWrappedTelecomFirstRep()
   {
      org.socraticgrid.fhir.generated.QICorePatientTelecom wrapperItem = new org.socraticgrid.fhir.generated.QICorePatientTelecom();
      ca.uhn.fhir.model.dstu2.composite.ContactPointDt item = adaptedClass
            .getTelecomFirstRep();
      if (item != null)
      {
         wrapperItem = new org.socraticgrid.fhir.generated.QICorePatientTelecom(
               item);
      }
      return wrapperItem;
   }

   public List<ContactPointDt> getTelecom()
   {
      return adaptedClass.getTelecom();
   }

   public IQICorePatient setTelecom(List<ContactPointDt> param)
   {
      adaptedClass.setTelecom(param);
      return this;
   }

   public IQICorePatient addTelecom(ContactPointDt param)
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

   public List<QICorePatientAddress> getWrappedAddress() {
		List<org.socraticgrid.fhir.generated.QICorePatientAddress> items = new java.util.ArrayList<>();
		for (ca.uhn.fhir.model.dstu2.composite.AddressDt type : adaptedClass
				.getAddress()) {
			items.add(new org.socraticgrid.fhir.generated.QICorePatientAddress(
					type));
		}
		return items;
	}

   public IQICorePatient setWrappedAddress(List<QICorePatientAddress> param) {
		List<ca.uhn.fhir.model.dstu2.composite.AddressDt> items = new java.util.ArrayList<>();
		for (org.socraticgrid.fhir.generated.QICorePatientAddress item : param) {
			items.add(item.getAdaptee());
		}
		adaptedClass.setAddress(items);
		return this;
	}

   public IQICorePatient addWrappedAddress(QICorePatientAddress param)
   {
      if (param != null)
      {
         adaptedClass.addAddress(param.getAdaptee());
      }
      return this;
   }

   public QICorePatientAddress addWrappedAddress()
   {
      ca.uhn.fhir.model.dstu2.composite.AddressDt item = new ca.uhn.fhir.model.dstu2.composite.AddressDt();
      adaptedClass.addAddress(item);
      return new org.socraticgrid.fhir.generated.QICorePatientAddress(item);
   }

   public QICorePatientAddress getWrappedAddressFirstRep()
   {
      org.socraticgrid.fhir.generated.QICorePatientAddress wrapperItem = new org.socraticgrid.fhir.generated.QICorePatientAddress();
      ca.uhn.fhir.model.dstu2.composite.AddressDt item = adaptedClass
            .getAddressFirstRep();
      if (item != null)
      {
         wrapperItem = new org.socraticgrid.fhir.generated.QICorePatientAddress(
               item);
      }
      return wrapperItem;
   }

   public List<AddressDt> getAddress()
   {
      return adaptedClass.getAddress();
   }

   public IQICorePatient setAddress(List<AddressDt> param)
   {
      adaptedClass.setAddress(param);
      return this;
   }

   public IQICorePatient addAddress(AddressDt param)
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

   public List<QICorePatientClinicalTrial> getClinicalTrial() {
		List<ca.uhn.fhir.model.api.ExtensionDt> extensions = adaptedClass
				.getUndeclaredExtensionsByUrl("http://hl7.org/fhir/StructureDefinition/patient-clinicalTrial");
		List<org.socraticgrid.fhir.generated.QICorePatientClinicalTrial> returnList = new java.util.ArrayList<>();
		for (ca.uhn.fhir.model.api.ExtensionDt extension : extensions) {
			org.socraticgrid.fhir.generated.QICorePatientClinicalTrial udt = new org.socraticgrid.fhir.generated.QICorePatientClinicalTrial();
			udt.setRootObjectExtension(extension);
			returnList.add(udt);
		}
		return returnList;
	}

   public IQICorePatient setClinicalTrial(
         List<QICorePatientClinicalTrial> param)
   {
      if (param != null && param.size() > 0)
      {
         for (int index = 0; index < ((List<org.socraticgrid.fhir.generated.QICorePatientClinicalTrial>) param)
               .size(); index++)
         {
            adaptedClass.addUndeclaredExtension(param.get(index)
                  .getRootObjectExtension());
         }
      }
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

   public IQICorePatient setDeceasedBoolean(BooleanDt param)
   {
      adaptedClass.setDeceased(param);
      return this;
   }

   public IQICorePatient setDeceasedBoolean(Boolean param)
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

   public IQICorePatient setDeceasedDateTime(DateTimeDt param)
   {
      adaptedClass.setDeceased(param);
      return this;
   }

   public IQICorePatient setDeceasedDateTime(Date param)
   {
      adaptedClass.setDeceased(new ca.uhn.fhir.model.primitive.DateTimeDt(
            param));
      return this;
   }

   public Patient.Animal getAnimal()
   {
      return adaptedClass.getAnimal();
   }

   public IQICorePatient setAnimal(Patient.Animal param)
   {
      adaptedClass.setAnimal(param);
      return this;
   }

   public QICoreOrganizationAdapter getManagingOrganizationResource()
   {
      if (adaptedClass.getManagingOrganization().getResource() instanceof ca.uhn.fhir.model.dstu2.resource.Organization)
      {
         org.socraticgrid.fhir.generated.QICoreOrganizationAdapter profiledType = new org.socraticgrid.fhir.generated.QICoreOrganizationAdapter();
         profiledType
               .setAdaptee((ca.uhn.fhir.model.dstu2.resource.Organization) adaptedClass
                     .getManagingOrganization().getResource());
         return profiledType;
      }
      else
      {
         return null;
      }
   }

   public IQICorePatient setManagingOrganizationResource(
         QICoreOrganizationAdapter param)
   {
      adaptedClass.getManagingOrganization().setResource(param.getAdaptee());
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

   public IQICorePatient setBirthDate(Date param)
   {
      adaptedClass
            .setBirthDate(new ca.uhn.fhir.model.primitive.DateDt(param));
      return this;
   }

   public IQICorePatient setBirthDate(DateDt param)
   {
      adaptedClass.setBirthDate(param);
      return this;
   }

   public List<Patient.Communication> getCommunication()
   {
      return adaptedClass.getCommunication();
   }

   public IQICorePatient setCommunication(List<Patient.Communication> param)
   {
      adaptedClass.setCommunication(param);
      return this;
   }

   public IQICorePatient addCommunication(Patient.Communication param)
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

   public DateTimeDt getBirthTime()
   {
      List<ca.uhn.fhir.model.api.ExtensionDt> extensions = adaptedClass
            .getUndeclaredExtensionsByUrl("http://hl7.org/fhir/StructureDefinition/patient-birthTime");
      if (extensions == null || extensions.size() <= 0)
      {
         return null;
      }
      else if (extensions.size() == 1)
      {
         return (ca.uhn.fhir.model.primitive.DateTimeDt) extensions.get(0)
               .getValue();
      }
      else
      {
         throw new RuntimeException(
               "More than one extension exists for birthTime");
      }
   }

   public IQICorePatient setBirthTime(DateTimeDt param)
   {
      adaptedClass.addUndeclaredExtension(false,
            "http://hl7.org/fhir/StructureDefinition/patient-birthTime",
            param);
      return this;
   }

   public List<HumanNameDt> getName()
   {
      return adaptedClass.getName();
   }

   public IQICorePatient setName(List<HumanNameDt> param)
   {
      adaptedClass.setName(param);
      return this;
   }

   public IQICorePatient addName(HumanNameDt param)
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

   public List<CodeableConceptDt> getDisability() {
		List<ExtensionDt> extensions = adaptedClass
				.getUndeclaredExtensionsByUrl("http://hl7.org/fhir/StructureDefinition/patient-disability");
		List<ca.uhn.fhir.model.dstu2.composite.CodeableConceptDt> returnList = new java.util.ArrayList<>();
		for (ExtensionDt extension : extensions) {
			returnList
					.add((ca.uhn.fhir.model.dstu2.composite.CodeableConceptDt) extension
							.getValue());
		}
		return returnList;
	}

   public IQICorePatient setDisability(List<CodeableConceptDt> param)
   {
      if (param != null && param.size() > 0)
      {
         for (int index = 0; index < ((List<ca.uhn.fhir.model.dstu2.composite.CodeableConceptDt>) param)
               .size(); index++)
         {
            adaptedClass
                  .addUndeclaredExtension(
                        false,
                        "http://hl7.org/fhir/StructureDefinition/patient-disability",
                        (ca.uhn.fhir.model.dstu2.composite.CodeableConceptDt) param
                              .get(index));
         }
      }
      return this;
   }

   public List<QICorePatientNationality> getNationality() {
		List<ca.uhn.fhir.model.api.ExtensionDt> extensions = adaptedClass
				.getUndeclaredExtensionsByUrl("http://hl7.org/fhir/StructureDefinition/patient-nationality");
		List<org.socraticgrid.fhir.generated.QICorePatientNationality> returnList = new java.util.ArrayList<>();
		for (ca.uhn.fhir.model.api.ExtensionDt extension : extensions) {
			org.socraticgrid.fhir.generated.QICorePatientNationality udt = new org.socraticgrid.fhir.generated.QICorePatientNationality();
			udt.setRootObjectExtension(extension);
			returnList.add(udt);
		}
		return returnList;
	}

   public IQICorePatient setNationality(List<QICorePatientNationality> param)
   {
      if (param != null && param.size() > 0)
      {
         for (int index = 0; index < ((List<org.socraticgrid.fhir.generated.QICorePatientNationality>) param)
               .size(); index++)
         {
            adaptedClass.addUndeclaredExtension(param.get(index)
                  .getRootObjectExtension());
         }
      }
      return this;
   }

   public List<Patient.Link> getLink()
   {
      return adaptedClass.getLink();
   }

   public IQICorePatient setLink(List<Patient.Link> param)
   {
      adaptedClass.setLink(param);
      return this;
   }

   public IQICorePatient addLink(Patient.Link param)
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

   public NarrativeDt getText()
   {
      return adaptedClass.getText();
   }

   public IQICorePatient setText(NarrativeDt param)
   {
      adaptedClass.setText(param);
      return this;
   }

   public BoundCodeableConceptDt<MaritalStatusCodesEnum> getMaritalStatus()
   {
      return adaptedClass.getMaritalStatus();
   }

   public IQICorePatient setMaritalStatus(
         BoundCodeableConceptDt<MaritalStatusCodesEnum> param)
   {
      adaptedClass.setMaritalStatus(param);
      return this;
   }

   public BooleanDt getCadavericDonor()
   {
      List<ca.uhn.fhir.model.api.ExtensionDt> extensions = adaptedClass
            .getUndeclaredExtensionsByUrl("http://hl7.org/fhir/StructureDefinition/patient-cadavericDonor");
      if (extensions == null || extensions.size() <= 0)
      {
         return null;
      }
      else if (extensions.size() == 1)
      {
         return (ca.uhn.fhir.model.primitive.BooleanDt) extensions.get(0)
               .getValue();
      }
      else
      {
         throw new RuntimeException(
               "More than one extension exists for cadavericDonor");
      }
   }

   public IQICorePatient setCadavericDonor(BooleanDt param)
   {
      adaptedClass
            .addUndeclaredExtension(
                  false,
                  "http://hl7.org/fhir/StructureDefinition/patient-cadavericDonor",
                  param);
      return this;
   }

   public CodeDt getLanguage()
   {
      return adaptedClass.getLanguage();
   }

   public IQICorePatient setLanguage(CodeDt param)
   {
      adaptedClass.setLanguage(param);
      return this;
   }

   public CodeableConceptDt getRace()
   {
      List<ca.uhn.fhir.model.api.ExtensionDt> extensions = adaptedClass
            .getUndeclaredExtensionsByUrl("http://hl7.org/fhir/StructureDefinition/us-core-race");
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
               "More than one extension exists for race");
      }
   }

   public IQICorePatient setRace(CodeableConceptDt param)
   {
      adaptedClass.addUndeclaredExtension(false,
            "http://hl7.org/fhir/StructureDefinition/us-core-race", param);
      return this;
   }

   public BooleanDt getActiveElement()
   {
      return adaptedClass.getActiveElement();
   }

   public Boolean getActive()
   {
      return adaptedClass.getActive();
   }

   public IQICorePatient setActive(Boolean param)
   {
      adaptedClass
            .setActive(new ca.uhn.fhir.model.primitive.BooleanDt(param));
      return this;
   }

   public IQICorePatient setActive(BooleanDt param)
   {
      adaptedClass.setActive(param);
      return this;
   }

   public List<IdentifierDt> getIdentifier()
   {
      return adaptedClass.getIdentifier();
   }

   public IQICorePatient setIdentifier(List<IdentifierDt> param)
   {
      adaptedClass.setIdentifier(param);
      return this;
   }

   public IQICorePatient addIdentifier(IdentifierDt param)
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

   public IQICorePatient setId(IdDt param)
   {
      adaptedClass.setId(param);
      return this;
   }

   public AddressDt getBirthPlace()
   {
      List<ca.uhn.fhir.model.api.ExtensionDt> extensions = adaptedClass
            .getUndeclaredExtensionsByUrl("http://hl7.org/fhir/StructureDefinition/birthPlace");
      if (extensions == null || extensions.size() <= 0)
      {
         return null;
      }
      else if (extensions.size() == 1)
      {
         return (ca.uhn.fhir.model.dstu2.composite.AddressDt) extensions
               .get(0).getValue();
      }
      else
      {
         throw new RuntimeException(
               "More than one extension exists for birthPlace");
      }
   }

   public IQICorePatient setBirthPlace(AddressDt param)
   {
      adaptedClass.addUndeclaredExtension(false,
            "http://hl7.org/fhir/StructureDefinition/birthPlace", param);
      return this;
   }

   public ContainedDt getContained()
   {
      return adaptedClass.getContained();
   }

   public IQICorePatient setContained(ContainedDt param)
   {
      adaptedClass.setContained(param);
      return this;
   }

   public CodeableConceptDt getMilitaryService()
   {
      List<ca.uhn.fhir.model.api.ExtensionDt> extensions = adaptedClass
            .getUndeclaredExtensionsByUrl("http://hl7.org/fhir/StructureDefinition/qicore-patient-militaryService");
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
               "More than one extension exists for militaryService");
      }
   }

   public IQICorePatient setMilitaryService(CodeableConceptDt param)
   {
      adaptedClass
            .addUndeclaredExtension(
                  false,
                  "http://hl7.org/fhir/StructureDefinition/qicore-patient-militaryService",
                  param);
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

   public IQICorePatient setMultipleBirthBoolean(BooleanDt param)
   {
      adaptedClass.setMultipleBirth(param);
      return this;
   }

   public IQICorePatient setMultipleBirthBoolean(Boolean param)
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

   public IQICorePatient setMultipleBirthInteger(IntegerDt param)
   {
      adaptedClass.setMultipleBirth(param);
      return this;
   }

   public IQICorePatient setMultipleBirthInteger(Integer param)
   {
      adaptedClass
            .setMultipleBirth(new ca.uhn.fhir.model.primitive.IntegerDt(
                  param));
      return this;
   }

   public CodeableConceptDt getEthnicity()
   {
      List<ca.uhn.fhir.model.api.ExtensionDt> extensions = adaptedClass
            .getUndeclaredExtensionsByUrl("http://hl7.org/fhir/StructureDefinition/us-core-ethnicity");
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
               "More than one extension exists for ethnicity");
      }
   }

   public IQICorePatient setEthnicity(CodeableConceptDt param)
   {
      adaptedClass.addUndeclaredExtension(false,
            "http://hl7.org/fhir/StructureDefinition/us-core-ethnicity",
            param);
      return this;
   }

   public CodeableConceptDt getReligion()
   {
      List<ca.uhn.fhir.model.api.ExtensionDt> extensions = adaptedClass
            .getUndeclaredExtensionsByUrl("http://hl7.org/fhir/StructureDefinition/us-core-religion");
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
               "More than one extension exists for religion");
      }
   }

   public IQICorePatient setReligion(CodeableConceptDt param)
   {
      adaptedClass.addUndeclaredExtension(false,
            "http://hl7.org/fhir/StructureDefinition/us-core-religion",
            param);
      return this;
   }
}