package org.cqf.qicore.dstu3;

import org.hl7.fhir.dstu3.model.Organization;

import java.util.List;

import org.hl7.fhir.dstu3.model.Reference;
import org.hl7.fhir.dstu3.model.Address;
import org.hl7.fhir.dstu3.model.StringType;

import java.lang.String;

import org.hl7.fhir.dstu3.model.BooleanType;

import java.lang.Boolean;

import org.hl7.fhir.dstu3.model.Identifier;
import org.hl7.fhir.dstu3.model.CodeableConcept;
import org.hl7.fhir.dstu3.model.CodeType;
import org.hl7.fhir.dstu3.model.ContactPoint;
import org.hl7.fhir.dstu3.model.Resource;
import org.hl7.fhir.dstu3.model.UriType;
import org.hl7.fhir.dstu3.model.IdType;

public interface Iqicoreorganization
{

   public Organization getAdaptee();

   public void setAdaptee(Organization param);

   public boolean hasPartOf();

   public Reference getPartOf();

   public Iqicoreorganization setPartOf(Reference param);

   public Organization getPartOfTarget();

   public Iqicoreorganization setPartOfTarget(Organization param);

   public qicoreorganizationAdapter getPartOfAdapterTarget();

   public Iqicoreorganization setPartOfAdapterTarget(
         qicoreorganizationAdapter param);

   public List<Address> getAddress();

   public qicoreorganizationAdapter setAddress(List<Address> param);

   public boolean hasAddress();

   public qicoreorganizationAdapter addAddress(Address param);

   public Address addAddress();

   public boolean hasName();

   public boolean hasNameElement();

   public StringType getNameElement();

   public String getName();

   public Iqicoreorganization setNameElement(StringType param);

   public Iqicoreorganization setName(String param);

   public List<Organization.OrganizationContactComponent> getContact();

   public qicoreorganizationAdapter setContact(
         List<Organization.OrganizationContactComponent> param);

   public boolean hasContact();

   public qicoreorganizationAdapter addContact(
         Organization.OrganizationContactComponent param);

   public Organization.OrganizationContactComponent addContact();

   public boolean hasActive();

   public boolean hasActiveElement();

   public BooleanType getActiveElement();

   public Boolean getActive();

   public Iqicoreorganization setActiveElement(BooleanType param);

   public Iqicoreorganization setActive(Boolean param);

   public boolean hasEndpoint();

   public List<Reference> getEndpoint();

   public List<Identifier> getIdentifier();

   public Iqicoreorganization setIdentifier(List<Identifier> param);

   public boolean hasIdentifier();

   public Iqicoreorganization addIdentifier(Identifier param);

   public Identifier addIdentifier();

   public boolean hasAlias();

   public boolean hasAlias(String param);

   public Iqicoreorganization addAlias(String param);

   public StringType addAliasElement();

   public List<StringType> getAlias();

   public Iqicoreorganization setAlias(List<StringType> param);

   public CodeableConcept getType();

   public Iqicoreorganization setType(CodeableConcept param);

   public boolean hasType();

   public boolean hasLanguage();

   public boolean hasLanguageElement();

   public CodeType getLanguageElement();

   public String getLanguage();

   public Iqicoreorganization setLanguageElement(CodeType param);

   public Iqicoreorganization setLanguage(String param);

   public List<ContactPoint> getTelecom();

   public Iqicoreorganization setTelecom(List<ContactPoint> param);

   public boolean hasTelecom();

   public Iqicoreorganization addTelecom(ContactPoint param);

   public ContactPoint addTelecom();

   public List<Resource> getContained();

   public Iqicoreorganization setContained(List<Resource> param);

   public boolean hasContained();

   public Iqicoreorganization addContained(Resource param);

   public boolean hasImplicitRules();

   public boolean hasImplicitRulesElement();

   public UriType getImplicitRulesElement();

   public String getImplicitRules();

   public Iqicoreorganization setImplicitRulesElement(UriType param);

   public Iqicoreorganization setImplicitRules(String param);

   public boolean hasId();

   public boolean hasIdElement();

   public IdType getIdElement();

   public String getId();

   public Iqicoreorganization setIdElement(IdType param);

   public Iqicoreorganization setId(String param);
}