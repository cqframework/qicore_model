package org.socraticgrid.fhir.dstu3.generated;

import org.socraticgrid.fhir.dstu3.generated.Iqicoredevice;
import org.hl7.fhir.dstu3.model.Device;
import org.hl7.fhir.dstu3.model.Reference;
import org.hl7.fhir.dstu3.model.Patient;
import org.hl7.fhir.dstu3.model.UriType;
import java.lang.String;
import org.hl7.fhir.dstu3.model.StringType;
import org.hl7.fhir.dstu3.model.ContactPoint;
import java.util.List;
import org.hl7.fhir.dstu3.model.Location;
import org.hl7.fhir.dstu3.model.Identifier;
import org.hl7.fhir.dstu3.model.Organization;
import org.hl7.fhir.dstu3.model.CodeType;
import org.hl7.fhir.dstu3.model.Enumeration;
import org.hl7.fhir.dstu3.model.CodeableConcept;
import org.hl7.fhir.dstu3.model.Resource;
import org.hl7.fhir.dstu3.model.IdType;
import org.hl7.fhir.dstu3.model.Annotation;
import org.hl7.fhir.dstu3.model.*;
import ca.uhn.fhir.model.api.ExtensionDt;

public class qicoredeviceAdapter implements Iqicoredevice
{

   private Device adaptedClass;

   public qicoredeviceAdapter()
   {
      this.adaptedClass = new org.hl7.fhir.dstu3.model.Device();
   }

   public qicoredeviceAdapter(Device adaptee)
   {
      this.adaptedClass = adaptee;
   }

   public Device getAdaptee()
   {
      return adaptedClass;
   }

   public void setAdaptee(Device param)
   {
      this.adaptedClass = param;
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

   public Iqicoredevice setPatient(Reference param)
   {
      adaptedClass.setPatient(param);
      return this;
   }

   public Patient getPatientTarget()
   {
      return (org.hl7.fhir.dstu3.model.Patient) adaptedClass
            .getPatientTarget();
   }

   public Iqicoredevice setPatientTarget(Patient param)
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

   public Iqicoredevice setPatientAdapterTarget(qicorepatientAdapter param)
   {
      adaptedClass.setPatientTarget(param.getAdaptee());
      return this;
   }

   public boolean hasUrl()
   {
      return adaptedClass.hasUrl();
   }

   public boolean hasUrlElement()
   {
      return adaptedClass.hasUrlElement();
   }

   public UriType getUrlElement()
   {
      try
      {
         return adaptedClass.getUrlElement();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting UrlElement", e);
      }
   }

   public String getUrl()
   {
      try
      {
         return adaptedClass.getUrl();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Url", e);
      }
   }

   public Iqicoredevice setUrlElement(UriType param)
   {
      adaptedClass.setUrlElement(param);
      return this;
   }

   public Iqicoredevice setUrl(String param)
   {
      adaptedClass.setUrl(param);
      return this;
   }

   public boolean hasModel()
   {
      return adaptedClass.hasModel();
   }

   public boolean hasModelElement()
   {
      return adaptedClass.hasModelElement();
   }

   public StringType getModelElement()
   {
      try
      {
         return adaptedClass.getModelElement();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting ModelElement", e);
      }
   }

   public String getModel()
   {
      try
      {
         return adaptedClass.getModel();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Model", e);
      }
   }

   public Iqicoredevice setModelElement(StringType param)
   {
      adaptedClass.setModelElement(param);
      return this;
   }

   public Iqicoredevice setModel(String param)
   {
      adaptedClass.setModel(param);
      return this;
   }

   public List<ContactPoint> getContact()
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

   public Iqicoredevice setContact(List<ContactPoint> param)
   {
      adaptedClass.setContact(param);
      return this;
   }

   public boolean hasContact()
   {
      return adaptedClass.hasContact();
   }

   public Iqicoredevice addContact(ContactPoint param)
   {
      adaptedClass.addContact(param);
      return this;
   }

   public ContactPoint addContact()
   {
      return adaptedClass.addContact();
   }

   public boolean hasLocation()
   {
      return adaptedClass.hasLocation();
   }

   public Reference getLocation()
   {
      try
      {
         return adaptedClass.getLocation();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Location", e);
      }
   }

   public Iqicoredevice setLocation(Reference param)
   {
      adaptedClass.setLocation(param);
      return this;
   }

   public Location getLocationTarget()
   {
      return (org.hl7.fhir.dstu3.model.Location) adaptedClass
            .getLocationTarget();
   }

   public Iqicoredevice setLocationTarget(Location param)
   {
      adaptedClass.setLocationTarget(param);
      return this;
   }

   public qicorelocationAdapter getLocationAdapterTarget()
   {
      if (adaptedClass.getLocation().getResource() instanceof org.hl7.fhir.dstu3.model.Location)
      {
         org.socraticgrid.fhir.dstu3.generated.qicorelocationAdapter profiledType = new org.socraticgrid.fhir.dstu3.generated.qicorelocationAdapter();
         profiledType
               .setAdaptee((org.hl7.fhir.dstu3.model.Location) adaptedClass
                     .getLocation().getResource());
         return profiledType;
      }
      else
      {
         return null;
      }
   }

   public Iqicoredevice setLocationAdapterTarget(qicorelocationAdapter param)
   {
      adaptedClass.setLocationTarget(param.getAdaptee());
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

   public Iqicoredevice setIdentifier(List<Identifier> param)
   {
      adaptedClass.setIdentifier(param);
      return this;
   }

   public boolean hasIdentifier()
   {
      return adaptedClass.hasIdentifier();
   }

   public Iqicoredevice addIdentifier(Identifier param)
   {
      adaptedClass.addIdentifier(param);
      return this;
   }

   public Identifier addIdentifier()
   {
      return adaptedClass.addIdentifier();
   }

   public Identifier getUdiCarrier()
   {
      try
      {
         return adaptedClass.getUdiCarrier();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting UdiCarrier", e);
      }
   }

   public Iqicoredevice setUdiCarrier(Identifier param)
   {
      adaptedClass.setUdiCarrier(param);
      return this;
   }

   public boolean hasUdiCarrier()
   {
      return adaptedClass.hasUdiCarrier();
   }

   public boolean hasOwner()
   {
      return adaptedClass.hasOwner();
   }

   public Reference getOwner()
   {
      try
      {
         return adaptedClass.getOwner();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Owner", e);
      }
   }

   public Iqicoredevice setOwner(Reference param)
   {
      adaptedClass.setOwner(param);
      return this;
   }

   public Organization getOwnerTarget()
   {
      return (org.hl7.fhir.dstu3.model.Organization) adaptedClass
            .getOwnerTarget();
   }

   public Iqicoredevice setOwnerTarget(Organization param)
   {
      adaptedClass.setOwnerTarget(param);
      return this;
   }

   public qicoreorganizationAdapter getOwnerAdapterTarget()
   {
      if (adaptedClass.getOwner().getResource() instanceof org.hl7.fhir.dstu3.model.Organization)
      {
         org.socraticgrid.fhir.dstu3.generated.qicoreorganizationAdapter profiledType = new org.socraticgrid.fhir.dstu3.generated.qicoreorganizationAdapter();
         profiledType
               .setAdaptee((org.hl7.fhir.dstu3.model.Organization) adaptedClass
                     .getOwner().getResource());
         return profiledType;
      }
      else
      {
         return null;
      }
   }

   public Iqicoredevice setOwnerAdapterTarget(qicoreorganizationAdapter param)
   {
      adaptedClass.setOwnerTarget(param.getAdaptee());
      return this;
   }

   public boolean hasLotNumber()
   {
      return adaptedClass.hasLotNumber();
   }

   public boolean hasLotNumberElement()
   {
      return adaptedClass.hasLotNumberElement();
   }

   public StringType getLotNumberElement()
   {
      try
      {
         return adaptedClass.getLotNumberElement();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting LotNumberElement", e);
      }
   }

   public String getLotNumber()
   {
      try
      {
         return adaptedClass.getLotNumber();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting LotNumber", e);
      }
   }

   public Iqicoredevice setLotNumberElement(StringType param)
   {
      adaptedClass.setLotNumberElement(param);
      return this;
   }

   public Iqicoredevice setLotNumber(String param)
   {
      adaptedClass.setLotNumber(param);
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

   public Iqicoredevice setLanguageElement(CodeType param)
   {
      adaptedClass.setLanguageElement(param);
      return this;
   }

   public Iqicoredevice setLanguage(String param)
   {
      adaptedClass.setLanguage(param);
      return this;
   }

   public boolean hasManufacturer()
   {
      return adaptedClass.hasManufacturer();
   }

   public boolean hasManufacturerElement()
   {
      return adaptedClass.hasManufacturerElement();
   }

   public StringType getManufacturerElement()
   {
      try
      {
         return adaptedClass.getManufacturerElement();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting ManufacturerElement", e);
      }
   }

   public String getManufacturer()
   {
      try
      {
         return adaptedClass.getManufacturer();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Manufacturer", e);
      }
   }

   public Iqicoredevice setManufacturerElement(StringType param)
   {
      adaptedClass.setManufacturerElement(param);
      return this;
   }

   public Iqicoredevice setManufacturer(String param)
   {
      adaptedClass.setManufacturer(param);
      return this;
   }

   public boolean hasStatus()
   {
      return adaptedClass.hasStatus();
   }

   public boolean hasStatusElement()
   {
      return adaptedClass.hasStatusElement();
   }

   public Device.DeviceStatus getStatus()
   {
      try
      {
         return adaptedClass.getStatus();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Status", e);
      }
   }

   public Enumeration<Device.DeviceStatus> getStatusElement()
   {
      try
      {
         return adaptedClass.getStatusElement();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting StatusElement", e);
      }
   }

   public Iqicoredevice setStatus(Device.DeviceStatus param)
   {
      adaptedClass.setStatus(param);
      return this;
   }

   public Iqicoredevice setStatusElement(Enumeration<Device.DeviceStatus> param)
   {
      adaptedClass.setStatusElement(param);
      return this;
   }

   public CodeableConcept getType()
   {
      try
      {
         return adaptedClass.getType();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Type", e);
      }
   }

   public Iqicoredevice setType(CodeableConcept param)
   {
      adaptedClass.setType(param);
      return this;
   }

   public boolean hasType()
   {
      return adaptedClass.hasType();
   }

   public boolean hasVersion()
   {
      return adaptedClass.hasVersion();
   }

   public boolean hasVersionElement()
   {
      return adaptedClass.hasVersionElement();
   }

   public StringType getVersionElement()
   {
      try
      {
         return adaptedClass.getVersionElement();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting VersionElement", e);
      }
   }

   public String getVersion()
   {
      try
      {
         return adaptedClass.getVersion();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Version", e);
      }
   }

   public Iqicoredevice setVersionElement(StringType param)
   {
      adaptedClass.setVersionElement(param);
      return this;
   }

   public Iqicoredevice setVersion(String param)
   {
      adaptedClass.setVersion(param);
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

   public Iqicoredevice setContained(List<Resource> param)
   {
      adaptedClass.setContained(param);
      return this;
   }

   public boolean hasContained()
   {
      return adaptedClass.hasContained();
   }

   public Iqicoredevice addContained(Resource param)
   {
      adaptedClass.addContained(param);
      return this;
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

   public Iqicoredevice setIdElement(IdType param)
   {
      adaptedClass.setIdElement(param);
      return this;
   }

   public Iqicoredevice setId(String param)
   {
      adaptedClass.setId(param);
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

   public Iqicoredevice setImplicitRulesElement(UriType param)
   {
      adaptedClass.setImplicitRulesElement(param);
      return this;
   }

   public Iqicoredevice setImplicitRules(String param)
   {
      adaptedClass.setImplicitRules(param);
      return this;
   }

   public List<Annotation> getNote()
   {
      try
      {
         return adaptedClass.getNote();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Note", e);
      }
   }

   public Iqicoredevice setNote(List<Annotation> param)
   {
      adaptedClass.setNote(param);
      return this;
   }

   public boolean hasNote()
   {
      return adaptedClass.hasNote();
   }

   public Iqicoredevice addNote(Annotation param)
   {
      adaptedClass.addNote(param);
      return this;
   }

   public Annotation addNote()
   {
      return adaptedClass.addNote();
   }
}