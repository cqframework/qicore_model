package org.socraticgrid.fhir.dstu3.generated;

import org.socraticgrid.fhir.dstu3.generated.Iqicorepatient;
import org.hl7.fhir.dstu3.model.Patient;
import org.hl7.fhir.dstu3.model.Attachment;
import java.util.List;
import org.hl7.fhir.dstu3.model.Enumeration;
import org.socraticgrid.fhir.dstu3.generated.qicorepatientTelecomAdapter;
import org.hl7.fhir.dstu3.model.ContactPoint;
import org.socraticgrid.fhir.dstu3.generated.qicorepatientAddressAdapter;
import org.hl7.fhir.dstu3.model.Address;
import org.hl7.fhir.dstu3.model.Type;
import org.hl7.fhir.dstu3.model.BooleanType;
import org.hl7.fhir.dstu3.model.Enumerations;
import org.hl7.fhir.dstu3.model.DateTimeType;
import org.hl7.fhir.dstu3.model.Reference;
import org.hl7.fhir.dstu3.model.Organization;
import org.hl7.fhir.dstu3.model.DateType;
import java.util.Date;
import org.hl7.fhir.dstu3.model.HumanName;
import org.hl7.fhir.dstu3.model.CodeableConcept;
import org.hl7.fhir.dstu3.model.CodeType;
import java.lang.String;
import org.hl7.fhir.dstu3.model.UriType;
import java.lang.Boolean;
import org.hl7.fhir.dstu3.model.Identifier;
import org.hl7.fhir.dstu3.model.IdType;
import org.hl7.fhir.dstu3.model.Resource;
import org.hl7.fhir.dstu3.model.IntegerType;
import org.socraticgrid.fhir.dstu3.generated.qicoreorganizationAdapter;
import org.socraticgrid.fhir.dstu3.generated.qicorepractitionerAdapter;
import org.hl7.fhir.dstu3.model.*;
import ca.uhn.fhir.model.api.ExtensionDt;

public class qicorepatientAdapter implements Iqicorepatient
{

   private Patient adaptedClass;

   public qicorepatientAdapter()
   {
      this.adaptedClass = new org.hl7.fhir.dstu3.model.Patient();
   }

   public qicorepatientAdapter(Patient adaptee)
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

   public Iqicorepatient setPhoto(List<Attachment> param)
   {
      adaptedClass.setPhoto(param);
      return this;
   }

   public boolean hasPhoto()
   {
      return adaptedClass.hasPhoto();
   }

   public Iqicorepatient addPhoto(Attachment param)
   {
      adaptedClass.addPhoto(param);
      return this;
   }

   public Attachment addPhoto()
   {
      return adaptedClass.addPhoto();
   }

   public List<Patient.ContactComponent> getContact()
   {
      try
      {
         return adaptedClass.getContact();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Contact", e);
      }
   }

   public qicorepatientAdapter setContact(List<Patient.ContactComponent> param)
   {
      adaptedClass.setContact(param);
      return this;
   }

   public boolean hasContact()
   {
      return adaptedClass.hasContact();
   }

   public qicorepatientAdapter addContact(Patient.ContactComponent param)
   {
      adaptedClass.addContact(param);
      return this;
   }

   public Patient.ContactComponent addContact()
   {
      return adaptedClass.addContact();
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

   public Iqicorepatient setGender(Enumerations.AdministrativeGender param)
   {
      adaptedClass.setGender(param);
      return this;
   }

   public Iqicorepatient setGenderElement(
         Enumeration<Enumerations.AdministrativeGender> param)
   {
      adaptedClass.setGenderElement(param);
      return this;
   }

   public List<qicorepatientTelecomAdapter> getWrappedTelecom() {
		List<org.socraticgrid.fhir.dstu3.generated.qicorepatientTelecomAdapter> wrappedItems = new java.util.ArrayList<>();
		List<org.hl7.fhir.dstu3.model.ContactPoint> items = adaptedClass
				.getTelecom();
		for (org.hl7.fhir.dstu3.model.ContactPoint item : items) {
			wrappedItems
					.add(new org.socraticgrid.fhir.dstu3.generated.qicorepatientTelecomAdapter(
							item));
		}
		return wrappedItems;
	}

   public Iqicorepatient setWrappedTelecom(
			List<qicorepatientTelecomAdapter> param) {
		List<org.hl7.fhir.dstu3.model.ContactPoint> items = new java.util.ArrayList<>();
		for (org.socraticgrid.fhir.dstu3.generated.qicorepatientTelecomAdapter item : param) {
			items.add(item.getAdaptee());
		}
		adaptedClass.getTelecom().addAll(items);
		return this;
	}

   public Iqicorepatient addWrappedTelecom(qicorepatientTelecomAdapter param)
   {
      if (param != null)
      {
         adaptedClass.addTelecom(param.getAdaptee());
      }
      return this;
   }

   public qicorepatientTelecomAdapter addWrappedTelecom()
   {
      org.hl7.fhir.dstu3.model.ContactPoint item = new org.hl7.fhir.dstu3.model.ContactPoint();
      adaptedClass.addTelecom(item);
      return new org.socraticgrid.fhir.dstu3.generated.qicorepatientTelecomAdapter(
            item);
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

   public Iqicorepatient setTelecom(List<ContactPoint> param)
   {
      adaptedClass.setTelecom(param);
      return this;
   }

   public boolean hasTelecom()
   {
      return adaptedClass.hasTelecom();
   }

   public Iqicorepatient addTelecom(ContactPoint param)
   {
      adaptedClass.addTelecom(param);
      return this;
   }

   public ContactPoint addTelecom()
   {
      return adaptedClass.addTelecom();
   }

   public List<qicorepatientAddressAdapter> getWrappedAddress() {
		List<org.socraticgrid.fhir.dstu3.generated.qicorepatientAddressAdapter> wrappedItems = new java.util.ArrayList<>();
		List<org.hl7.fhir.dstu3.model.Address> items = adaptedClass
				.getAddress();
		for (org.hl7.fhir.dstu3.model.Address item : items) {
			wrappedItems
					.add(new org.socraticgrid.fhir.dstu3.generated.qicorepatientAddressAdapter(
							item));
		}
		return wrappedItems;
	}

   public Iqicorepatient setWrappedAddress(
			List<qicorepatientAddressAdapter> param) {
		List<org.hl7.fhir.dstu3.model.Address> items = new java.util.ArrayList<>();
		for (org.socraticgrid.fhir.dstu3.generated.qicorepatientAddressAdapter item : param) {
			items.add(item.getAdaptee());
		}
		adaptedClass.getAddress().addAll(items);
		return this;
	}

   public Iqicorepatient addWrappedAddress(qicorepatientAddressAdapter param)
   {
      if (param != null)
      {
         adaptedClass.addAddress(param.getAdaptee());
      }
      return this;
   }

   public qicorepatientAddressAdapter addWrappedAddress()
   {
      org.hl7.fhir.dstu3.model.Address item = new org.hl7.fhir.dstu3.model.Address();
      adaptedClass.addAddress(item);
      return new org.socraticgrid.fhir.dstu3.generated.qicorepatientAddressAdapter(
            item);
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

   public Iqicorepatient setAddress(List<Address> param)
   {
      adaptedClass.setAddress(param);
      return this;
   }

   public boolean hasAddress()
   {
      return adaptedClass.hasAddress();
   }

   public Iqicorepatient addAddress(Address param)
   {
      adaptedClass.addAddress(param);
      return this;
   }

   public Address addAddress()
   {
      return adaptedClass.addAddress();
   }

   public List<qicorepatientClinicalTrialAdapter> getClinicalTrial() {
		List<org.hl7.fhir.dstu3.model.Extension> extensions = adaptedClass
				.getExtensionsByUrl("http://hl7.org/fhir/StructureDefinition/patient-clinicalTrial");
		List<org.socraticgrid.fhir.dstu3.generated.qicorepatientClinicalTrialAdapter> returnList = new java.util.ArrayList<>();
		for (org.hl7.fhir.dstu3.model.Extension extension : extensions) {
			org.socraticgrid.fhir.dstu3.generated.qicorepatientClinicalTrialAdapter udt = new org.socraticgrid.fhir.dstu3.generated.qicorepatientClinicalTrialAdapter();
			udt.setRootObjectExtension(extension);
			returnList.add(udt);
		}
		return returnList;
	}

   public Iqicorepatient setClinicalTrial(
         List<qicorepatientClinicalTrialAdapter> param)
   {
      if (param != null && param.size() > 0)
      {
         for (int index = 0; index < ((List<org.socraticgrid.fhir.dstu3.generated.qicorepatientClinicalTrialAdapter>) param)
               .size(); index++)
         {
            adaptedClass.addExtension(param.get(index)
                  .getRootObjectExtension());
         }
      }
      return this;
   }

   public Type getDeceased()
   {
      try
      {
         return adaptedClass.getDeceased();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Deceased", e);
      }
   }

   public Iqicorepatient setDeceased(Type param)
   {
      adaptedClass.setDeceased(param);
      return this;
   }

   public BooleanType getDeceasedBooleanType()
   {
      try
      {
         return adaptedClass.getDeceasedBooleanType();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting DeceasedBooleanType", e);
      }
   }

   public boolean hasDeceasedBooleanType()
   {
      return adaptedClass.hasDeceasedBooleanType();
   }

   public DateTimeType getDeceasedDateTimeType()
   {
      try
      {
         return adaptedClass.getDeceasedDateTimeType();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting DeceasedDateTimeType", e);
      }
   }

   public boolean hasDeceasedDateTimeType()
   {
      return adaptedClass.hasDeceasedDateTimeType();
   }

   public boolean hasManagingOrganization()
   {
      return adaptedClass.hasManagingOrganization();
   }

   public Reference getManagingOrganization()
   {
      try
      {
         return adaptedClass.getManagingOrganization();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting ManagingOrganization", e);
      }
   }

   public Iqicorepatient setManagingOrganization(Reference param)
   {
      adaptedClass.setManagingOrganization(param);
      return this;
   }

   public Organization getManagingOrganizationTarget()
   {
      return (org.hl7.fhir.dstu3.model.Organization) adaptedClass
            .getManagingOrganizationTarget();
   }

   public Iqicorepatient setManagingOrganizationTarget(Organization param)
   {
      adaptedClass.setManagingOrganizationTarget(param);
      return this;
   }

   public qicoreorganizationAdapter getManagingOrganizationAdapterTarget()
   {
      if (adaptedClass.getManagingOrganization().getResource() instanceof org.hl7.fhir.dstu3.model.Organization)
      {
         org.socraticgrid.fhir.dstu3.generated.qicoreorganizationAdapter profiledType = new org.socraticgrid.fhir.dstu3.generated.qicoreorganizationAdapter();
         profiledType
               .setAdaptee((org.hl7.fhir.dstu3.model.Organization) adaptedClass
                     .getManagingOrganization().getResource());
         return profiledType;
      }
      else
      {
         return null;
      }
   }

   public Iqicorepatient setManagingOrganizationAdapterTarget(
         qicoreorganizationAdapter param)
   {
      adaptedClass.setManagingOrganizationTarget(param.getAdaptee());
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

   public Iqicorepatient setBirthDateElement(DateType param)
   {
      adaptedClass.setBirthDateElement(param);
      return this;
   }

   public Iqicorepatient setBirthDate(Date param)
   {
      adaptedClass.setBirthDate(param);
      return this;
   }

   public List<Patient.PatientCommunicationComponent> getCommunication()
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

   public qicorepatientAdapter setCommunication(
         List<Patient.PatientCommunicationComponent> param)
   {
      adaptedClass.setCommunication(param);
      return this;
   }

   public boolean hasCommunication()
   {
      return adaptedClass.hasCommunication();
   }

   public qicorepatientAdapter addCommunication(
         Patient.PatientCommunicationComponent param)
   {
      adaptedClass.addCommunication(param);
      return this;
   }

   public Patient.PatientCommunicationComponent addCommunication()
   {
      return adaptedClass.addCommunication();
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

   public Iqicorepatient setName(List<HumanName> param)
   {
      adaptedClass.setName(param);
      return this;
   }

   public boolean hasName()
   {
      return adaptedClass.hasName();
   }

   public Iqicorepatient addName(HumanName param)
   {
      adaptedClass.addName(param);
      return this;
   }

   public HumanName addName()
   {
      return adaptedClass.addName();
   }

   public List<CodeableConcept> getDisability() {
		List<org.hl7.fhir.dstu3.model.Extension> extensions = adaptedClass
				.getExtensionsByUrl("http://hl7.org/fhir/StructureDefinition/patient-disability");
		List<org.hl7.fhir.dstu3.model.CodeableConcept> returnList = new java.util.ArrayList<>();
		for (org.hl7.fhir.dstu3.model.Extension extension : extensions) {
			returnList.add((org.hl7.fhir.dstu3.model.CodeableConcept) extension
					.getValue());
		}
		return returnList;
	}

   public Iqicorepatient setDisability(List<CodeableConcept> param)
   {
      if (param != null && param.size() > 0)
      {
         for (int index = 0; index < param.size(); index++)
         {
            adaptedClass
                  .addExtension()
                  .setUrl("http://hl7.org/fhir/StructureDefinition/patient-disability")
                  .setValue(param.get(index));
         }
      }
      return this;
   }

   public List<qicorepatientNationalityAdapter> getNationality() {
		List<org.hl7.fhir.dstu3.model.Extension> extensions = adaptedClass
				.getExtensionsByUrl("http://hl7.org/fhir/StructureDefinition/patient-nationality");
		List<org.socraticgrid.fhir.dstu3.generated.qicorepatientNationalityAdapter> returnList = new java.util.ArrayList<>();
		for (org.hl7.fhir.dstu3.model.Extension extension : extensions) {
			org.socraticgrid.fhir.dstu3.generated.qicorepatientNationalityAdapter udt = new org.socraticgrid.fhir.dstu3.generated.qicorepatientNationalityAdapter();
			udt.setRootObjectExtension(extension);
			returnList.add(udt);
		}
		return returnList;
	}

   public Iqicorepatient setNationality(
         List<qicorepatientNationalityAdapter> param)
   {
      if (param != null && param.size() > 0)
      {
         for (int index = 0; index < ((List<org.socraticgrid.fhir.dstu3.generated.qicorepatientNationalityAdapter>) param)
               .size(); index++)
         {
            adaptedClass.addExtension(param.get(index)
                  .getRootObjectExtension());
         }
      }
      return this;
   }

   public List<Patient.PatientLinkComponent> getLink()
   {
      try
      {
         return adaptedClass.getLink();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Link", e);
      }
   }

   public qicorepatientAdapter setLink(List<Patient.PatientLinkComponent> param)
   {
      adaptedClass.setLink(param);
      return this;
   }

   public boolean hasLink()
   {
      return adaptedClass.hasLink();
   }

   public qicorepatientAdapter addLink(Patient.PatientLinkComponent param)
   {
      adaptedClass.addLink(param);
      return this;
   }

   public Patient.PatientLinkComponent addLink()
   {
      return adaptedClass.addLink();
   }

   public CodeableConcept getMaritalStatus()
   {
      try
      {
         return adaptedClass.getMaritalStatus();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting MaritalStatus", e);
      }
   }

   public Iqicorepatient setMaritalStatus(CodeableConcept param)
   {
      adaptedClass.setMaritalStatus(param);
      return this;
   }

   public boolean hasMaritalStatus()
   {
      return adaptedClass.hasMaritalStatus();
   }

   public BooleanType getCadavericDonor()
   {
      List<org.hl7.fhir.dstu3.model.Extension> extensions = adaptedClass
            .getExtensionsByUrl("http://hl7.org/fhir/StructureDefinition/patient-cadavericDonor");
      if (extensions == null || extensions.size() <= 0)
      {
         return null;
      }
      else if (extensions.size() == 1)
      {
         return (org.hl7.fhir.dstu3.model.BooleanType) extensions.get(0)
               .getValue();
      }
      else
      {
         throw new RuntimeException(
               "More than one extension exists for cadavericDonor");
      }
   }

   public Iqicorepatient setCadavericDonor(BooleanType param)
   {
      adaptedClass
            .addExtension()
            .setUrl("http://hl7.org/fhir/StructureDefinition/patient-cadavericDonor")
            .setValue(param);
      return this;
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

   public Iqicorepatient setLanguageElement(CodeType param)
   {
      adaptedClass.setLanguageElement(param);
      return this;
   }

   public Iqicorepatient setLanguage(String param)
   {
      adaptedClass.setLanguage(param);
      return this;
   }

   public CodeableConcept getRace()
   {
      List<org.hl7.fhir.dstu3.model.Extension> extensions = adaptedClass
            .getExtensionsByUrl("http://hl7.org/fhir/StructureDefinition/us-core-race");
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
               "More than one extension exists for race");
      }
   }

   public Iqicorepatient setRace(CodeableConcept param)
   {
      adaptedClass.addExtension()
            .setUrl("http://hl7.org/fhir/StructureDefinition/us-core-race")
            .setValue(param);
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

   public Iqicorepatient setImplicitRulesElement(UriType param)
   {
      adaptedClass.setImplicitRulesElement(param);
      return this;
   }

   public Iqicorepatient setImplicitRules(String param)
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

   public Iqicorepatient setActiveElement(BooleanType param)
   {
      adaptedClass.setActiveElement(param);
      return this;
   }

   public Iqicorepatient setActive(Boolean param)
   {
      adaptedClass.setActive(param);
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

   public Iqicorepatient setIdentifier(List<Identifier> param)
   {
      adaptedClass.setIdentifier(param);
      return this;
   }

   public boolean hasIdentifier()
   {
      return adaptedClass.hasIdentifier();
   }

   public Iqicorepatient addIdentifier(Identifier param)
   {
      adaptedClass.addIdentifier(param);
      return this;
   }

   public Identifier addIdentifier()
   {
      return adaptedClass.addIdentifier();
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

   public Iqicorepatient setIdElement(IdType param)
   {
      adaptedClass.setIdElement(param);
      return this;
   }

   public Iqicorepatient setId(String param)
   {
      adaptedClass.setId(param);
      return this;
   }

   public Address getBirthPlace()
   {
      List<org.hl7.fhir.dstu3.model.Extension> extensions = adaptedClass
            .getExtensionsByUrl("http://hl7.org/fhir/StructureDefinition/birthPlace");
      if (extensions == null || extensions.size() <= 0)
      {
         return null;
      }
      else if (extensions.size() == 1)
      {
         return (org.hl7.fhir.dstu3.model.Address) extensions.get(0)
               .getValue();
      }
      else
      {
         throw new RuntimeException(
               "More than one extension exists for birthPlace");
      }
   }

   public Iqicorepatient setBirthPlace(Address param)
   {
      adaptedClass.addExtension()
            .setUrl("http://hl7.org/fhir/StructureDefinition/birthPlace")
            .setValue(param);
      return this;
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

   public Iqicorepatient setContained(List<Resource> param)
   {
      adaptedClass.setContained(param);
      return this;
   }

   public boolean hasContained()
   {
      return adaptedClass.hasContained();
   }

   public Iqicorepatient addContained(Resource param)
   {
      adaptedClass.addContained(param);
      return this;
   }

   public CodeableConcept getMilitaryService()
   {
      List<org.hl7.fhir.dstu3.model.Extension> extensions = adaptedClass
            .getExtensionsByUrl("http://hl7.org/fhir/qicore/StructureDefinition/patient-militaryService");
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
               "More than one extension exists for militaryService");
      }
   }

   public Iqicorepatient setMilitaryService(CodeableConcept param)
   {
      adaptedClass
            .addExtension()
            .setUrl("http://hl7.org/fhir/qicore/StructureDefinition/patient-militaryService")
            .setValue(param);
      return this;
   }

   public Type getMultipleBirth()
   {
      try
      {
         return adaptedClass.getMultipleBirth();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting MultipleBirth", e);
      }
   }

   public Iqicorepatient setMultipleBirth(Type param)
   {
      adaptedClass.setMultipleBirth(param);
      return this;
   }

   public BooleanType getMultipleBirthBooleanType()
   {
      try
      {
         return adaptedClass.getMultipleBirthBooleanType();
      }
      catch (Exception e)
      {
         throw new RuntimeException(
               "Error getting MultipleBirthBooleanType", e);
      }
   }

   public boolean hasMultipleBirthBooleanType()
   {
      return adaptedClass.hasMultipleBirthBooleanType();
   }

   public IntegerType getMultipleBirthIntegerType()
   {
      try
      {
         return adaptedClass.getMultipleBirthIntegerType();
      }
      catch (Exception e)
      {
         throw new RuntimeException(
               "Error getting MultipleBirthIntegerType", e);
      }
   }

   public boolean hasMultipleBirthIntegerType()
   {
      return adaptedClass.hasMultipleBirthIntegerType();
   }

   public boolean hasGeneralPractitioner()
   {
      return adaptedClass.hasGeneralPractitioner();
   }

   public List<Organization> getGeneralPractitionerOrganizationTarget() {
		List<org.hl7.fhir.dstu3.model.Organization> items = new java.util.ArrayList<>();
		List<org.hl7.fhir.dstu3.model.Resource> resources = adaptedClass
				.getGeneralPractitionerTarget();
		for (org.hl7.fhir.dstu3.model.Resource resource : resources) {
			items.add((org.hl7.fhir.dstu3.model.Organization) resource);
		}
		return items;
	}

   public List<Reference> getGeneralPractitioner()
   {
      return adaptedClass.getGeneralPractitioner();
   }

   public List<Practitioner> getGeneralPractitionerPractitionerTarget() {
		List<org.hl7.fhir.dstu3.model.Practitioner> items = new java.util.ArrayList<>();
		List<org.hl7.fhir.dstu3.model.Resource> resources = adaptedClass
				.getGeneralPractitionerTarget();
		for (org.hl7.fhir.dstu3.model.Resource resource : resources) {
			items.add((org.hl7.fhir.dstu3.model.Practitioner) resource);
		}
		return items;
	}

   public CodeableConcept getEthnicity()
   {
      List<org.hl7.fhir.dstu3.model.Extension> extensions = adaptedClass
            .getExtensionsByUrl("http://hl7.org/fhir/StructureDefinition/us-core-ethnicity");
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
               "More than one extension exists for ethnicity");
      }
   }

   public Iqicorepatient setEthnicity(CodeableConcept param)
   {
      adaptedClass
            .addExtension()
            .setUrl("http://hl7.org/fhir/StructureDefinition/us-core-ethnicity")
            .setValue(param);
      return this;
   }

   public CodeableConcept getReligion()
   {
      List<org.hl7.fhir.dstu3.model.Extension> extensions = adaptedClass
            .getExtensionsByUrl("http://hl7.org/fhir/StructureDefinition/us-core-religion");
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
               "More than one extension exists for religion");
      }
   }

   public Iqicorepatient setReligion(CodeableConcept param)
   {
      adaptedClass
            .addExtension()
            .setUrl("http://hl7.org/fhir/StructureDefinition/us-core-religion")
            .setValue(param);
      return this;
   }
}