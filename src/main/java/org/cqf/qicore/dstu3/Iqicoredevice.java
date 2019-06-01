package org.cqf.qicore.dstu3;

import org.hl7.fhir.dstu3.model.Device;

import java.util.List;

import org.hl7.fhir.dstu3.model.Reference;
import org.hl7.fhir.dstu3.model.Patient;
import org.hl7.fhir.dstu3.model.UriType;

import java.lang.String;

import org.hl7.fhir.dstu3.model.StringType;
import org.hl7.fhir.dstu3.model.ContactPoint;
import org.hl7.fhir.dstu3.model.Location;
import org.hl7.fhir.dstu3.model.Identifier;
import org.hl7.fhir.dstu3.model.Organization;
import org.hl7.fhir.dstu3.model.CodeType;
import org.hl7.fhir.dstu3.model.Enumeration;
import org.hl7.fhir.dstu3.model.CodeableConcept;
import org.hl7.fhir.dstu3.model.Resource;
import org.hl7.fhir.dstu3.model.IdType;
import org.hl7.fhir.dstu3.model.Annotation;

public interface Iqicoredevice
{

   public Device getAdaptee();

   public void setAdaptee(Device param);

   public boolean hasPatient();

   public Reference getPatient();

   public Iqicoredevice setPatient(Reference param);

   public Patient getPatientTarget();

   public Iqicoredevice setPatientTarget(Patient param);

   public qicorepatientAdapter getPatientAdapterTarget();

   public Iqicoredevice setPatientAdapterTarget(qicorepatientAdapter param);

   public boolean hasUrl();

   public boolean hasUrlElement();

   public UriType getUrlElement();

   public String getUrl();

   public Iqicoredevice setUrlElement(UriType param);

   public Iqicoredevice setUrl(String param);

   public boolean hasModel();

   public boolean hasModelElement();

   public StringType getModelElement();

   public String getModel();

   public Iqicoredevice setModelElement(StringType param);

   public Iqicoredevice setModel(String param);

   public List<ContactPoint> getContact();

   public Iqicoredevice setContact(List<ContactPoint> param);

   public boolean hasContact();

   public Iqicoredevice addContact(ContactPoint param);

   public ContactPoint addContact();

   public boolean hasLocation();

   public Reference getLocation();

   public Iqicoredevice setLocation(Reference param);

   public Location getLocationTarget();

   public Iqicoredevice setLocationTarget(Location param);

   public qicorelocationAdapter getLocationAdapterTarget();

   public Iqicoredevice setLocationAdapterTarget(qicorelocationAdapter param);

   public List<Identifier> getIdentifier();

   public Iqicoredevice setIdentifier(List<Identifier> param);

   public boolean hasIdentifier();

   public Iqicoredevice addIdentifier(Identifier param);

   public Identifier addIdentifier();

   public Identifier getUdiCarrier();

   public Iqicoredevice setUdiCarrier(Identifier param);

   public boolean hasUdiCarrier();

   public boolean hasOwner();

   public Reference getOwner();

   public Iqicoredevice setOwner(Reference param);

   public Organization getOwnerTarget();

   public Iqicoredevice setOwnerTarget(Organization param);

   public qicoreorganizationAdapter getOwnerAdapterTarget();

   public Iqicoredevice setOwnerAdapterTarget(qicoreorganizationAdapter param);

   public boolean hasLotNumber();

   public boolean hasLotNumberElement();

   public StringType getLotNumberElement();

   public String getLotNumber();

   public Iqicoredevice setLotNumberElement(StringType param);

   public Iqicoredevice setLotNumber(String param);

   public boolean hasLanguage();

   public boolean hasLanguageElement();

   public CodeType getLanguageElement();

   public String getLanguage();

   public Iqicoredevice setLanguageElement(CodeType param);

   public Iqicoredevice setLanguage(String param);

   public boolean hasManufacturer();

   public boolean hasManufacturerElement();

   public StringType getManufacturerElement();

   public String getManufacturer();

   public Iqicoredevice setManufacturerElement(StringType param);

   public Iqicoredevice setManufacturer(String param);

   public boolean hasStatus();

   public boolean hasStatusElement();

   public Device.FHIRDeviceStatus getStatus();

   public Enumeration<Device.FHIRDeviceStatus> getStatusElement();

   public Iqicoredevice setStatus(Device.FHIRDeviceStatus param);

   public Iqicoredevice setStatusElement(Enumeration<Device.FHIRDeviceStatus> param);

   public CodeableConcept getType();

   public Iqicoredevice setType(CodeableConcept param);

   public boolean hasType();

   public boolean hasVersion();

   public boolean hasVersionElement();

   public StringType getVersionElement();

   public String getVersion();

   public Iqicoredevice setVersionElement(StringType param);

   public Iqicoredevice setVersion(String param);

   public List<Resource> getContained();

   public Iqicoredevice setContained(List<Resource> param);

   public boolean hasContained();

   public Iqicoredevice addContained(Resource param);

   public boolean hasId();

   public boolean hasIdElement();

   public IdType getIdElement();

   public String getId();

   public Iqicoredevice setIdElement(IdType param);

   public Iqicoredevice setId(String param);

   public boolean hasImplicitRules();

   public boolean hasImplicitRulesElement();

   public UriType getImplicitRulesElement();

   public String getImplicitRules();

   public Iqicoredevice setImplicitRulesElement(UriType param);

   public Iqicoredevice setImplicitRules(String param);

   public List<Annotation> getNote();

   public Iqicoredevice setNote(List<Annotation> param);

   public boolean hasNote();

   public Iqicoredevice addNote(Annotation param);

   public Annotation addNote();
}
