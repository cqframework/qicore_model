package org.socraticgrid.fhir.generated;

import ca.uhn.fhir.model.dstu2.resource.Immunization;
import ca.uhn.fhir.model.api.ExtensionDt;
import java.util.List;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.Practitioner;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.Location;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.primitive.StringDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.primitive.DateDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import java.util.Date;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.composite.NarrativeDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.primitive.BooleanDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.composite.SimpleQuantityDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.primitive.CodeDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.Encounter;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.composite.ContainedDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.primitive.DateTimeDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.composite.CodeableConceptDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.Patient;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.composite.AnnotationDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.primitive.IdDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.Organization;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.composite.IdentifierDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;

public interface IImmunization
{

   public Immunization getAdaptee();

   public void setAdaptee(Immunization param);

   public Practitioner getRequesterResource();

   public IImmunization setRequesterResource(Practitioner param);

   public Location getLocationResource();

   public IImmunization setLocationResource(Location param);

   public StringDt getLotNumberElement();

   public String getLotNumber();

   public IImmunization setLotNumber(String param);

   public IImmunization setLotNumber(StringDt param);

   public Immunization.Explanation getExplanation();

   public IImmunization setExplanation(Immunization.Explanation param);

   public DateDt getExpirationDateElement();

   public Date getExpirationDate();

   public IImmunization setExpirationDate(Date param);

   public IImmunization setExpirationDate(DateDt param);

   public List<Immunization.VaccinationProtocol> getVaccinationProtocol();

   public IImmunization setVaccinationProtocol(
         List<Immunization.VaccinationProtocol> param);

   public IImmunization addVaccinationProtocol(
         Immunization.VaccinationProtocol param);

   public Immunization.VaccinationProtocol addVaccinationProtocol();

   public Immunization.VaccinationProtocol getVaccinationProtocolFirstRep();

   public List<Immunization.Reaction> getReaction();

   public IImmunization setReaction(List<Immunization.Reaction> param);

   public IImmunization addReaction(Immunization.Reaction param);

   public Immunization.Reaction addReaction();

   public Immunization.Reaction getReactionFirstRep();

   public NarrativeDt getText();

   public IImmunization setText(NarrativeDt param);

   public BooleanDt getReportedElement();

   public Boolean getReported();

   public IImmunization setReported(Boolean param);

   public IImmunization setReported(BooleanDt param);

   public SimpleQuantityDt getDoseQuantity();

   public IImmunization setDoseQuantity(SimpleQuantityDt param);

   public CodeDt getLanguage();

   public IImmunization setLanguage(CodeDt param);

   public Encounter getEncounterResource();

   public IImmunization setEncounterResource(Encounter param);

   public ContainedDt getContained();

   public IImmunization setContained(ContainedDt param);

   public DateTimeDt getDateElement();

   public Date getDate();

   public IImmunization setDate(Date param);

   public IImmunization setDate(DateTimeDt param);

   public CodeableConceptDt getRoute();

   public IImmunization setRoute(CodeableConceptDt param);

   public BooleanDt getWasNotGivenElement();

   public Boolean getWasNotGiven();

   public IImmunization setWasNotGiven(Boolean param);

   public IImmunization setWasNotGiven(BooleanDt param);

   public Patient getPatientResource();

   public IImmunization setPatientResource(Patient param);

   public Practitioner getPerformerResource();

   public IImmunization setPerformerResource(Practitioner param);

   public CodeableConceptDt getSite();

   public IImmunization setSite(CodeableConceptDt param);

   public CodeableConceptDt getVaccineCode();

   public IImmunization setVaccineCode(CodeableConceptDt param);

   public List<AnnotationDt> getNote();

   public IImmunization setNote(List<AnnotationDt> param);

   public IImmunization addNote(AnnotationDt param);

   public AnnotationDt addNote();

   public AnnotationDt getNoteFirstRep();

   public IdDt getId();

   public IImmunization setId(IdDt param);

   public Organization getManufacturerResource();

   public IImmunization setManufacturerResource(Organization param);

   public String getStatus();

   public IImmunization setStatus(String param);

   public CodeDt getStatusElement();

   public IImmunization setStatus(CodeDt param);

   public List<IdentifierDt> getIdentifier();

   public IImmunization setIdentifier(List<IdentifierDt> param);

   public IImmunization addIdentifier(IdentifierDt param);

   public IdentifierDt addIdentifier();

   public IdentifierDt getIdentifierFirstRep();
}