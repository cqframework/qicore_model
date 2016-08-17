package org.socraticgrid.fhir.generated;

import ca.uhn.fhir.model.dstu2.resource.Immunization;
import ca.uhn.fhir.model.api.ExtensionDt;
import java.util.List;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
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

public interface IQICoreImmunization
{

   public Immunization getAdaptee();

   public void setAdaptee(Immunization param);

   public QICorePractitionerAdapter getRequesterResource();

   public IQICoreImmunization setRequesterResource(
         QICorePractitionerAdapter param);

   public QICoreLocationAdapter getLocationResource();

   public IQICoreImmunization setLocationResource(QICoreLocationAdapter param);

   public StringDt getLotNumberElement();

   public String getLotNumber();

   public IQICoreImmunization setLotNumber(String param);

   public IQICoreImmunization setLotNumber(StringDt param);

   public Immunization.Explanation getExplanation();

   public IQICoreImmunization setExplanation(Immunization.Explanation param);

   public DateDt getExpirationDateElement();

   public Date getExpirationDate();

   public IQICoreImmunization setExpirationDate(Date param);

   public IQICoreImmunization setExpirationDate(DateDt param);

   public List<Immunization.VaccinationProtocol> getVaccinationProtocol();

   public IQICoreImmunization setVaccinationProtocol(
         List<Immunization.VaccinationProtocol> param);

   public IQICoreImmunization addVaccinationProtocol(
         Immunization.VaccinationProtocol param);

   public Immunization.VaccinationProtocol addVaccinationProtocol();

   public Immunization.VaccinationProtocol getVaccinationProtocolFirstRep();

   public List<Immunization.Reaction> getReaction();

   public IQICoreImmunization setReaction(List<Immunization.Reaction> param);

   public IQICoreImmunization addReaction(Immunization.Reaction param);

   public Immunization.Reaction addReaction();

   public Immunization.Reaction getReactionFirstRep();

   public NarrativeDt getText();

   public IQICoreImmunization setText(NarrativeDt param);

   public BooleanDt getReportedElement();

   public Boolean getReported();

   public IQICoreImmunization setReported(Boolean param);

   public IQICoreImmunization setReported(BooleanDt param);

   public SimpleQuantityDt getDoseQuantity();

   public IQICoreImmunization setDoseQuantity(SimpleQuantityDt param);

   public CodeDt getLanguage();

   public IQICoreImmunization setLanguage(CodeDt param);

   public QICoreEncounterAdapter getEncounterResource();

   public IQICoreImmunization setEncounterResource(QICoreEncounterAdapter param);

   public ContainedDt getContained();

   public IQICoreImmunization setContained(ContainedDt param);

   public DateTimeDt getDateElement();

   public Date getDate();

   public IQICoreImmunization setDate(Date param);

   public IQICoreImmunization setDate(DateTimeDt param);

   public CodeableConceptDt getRoute();

   public IQICoreImmunization setRoute(CodeableConceptDt param);

   public BooleanDt getWasNotGivenElement();

   public Boolean getWasNotGiven();

   public IQICoreImmunization setWasNotGiven(Boolean param);

   public IQICoreImmunization setWasNotGiven(BooleanDt param);

   public QICorePatientAdapter getPatientResource();

   public IQICoreImmunization setPatientResource(QICorePatientAdapter param);

   public QICorePractitionerAdapter getPerformerResource();

   public IQICoreImmunization setPerformerResource(
         QICorePractitionerAdapter param);

   public CodeableConceptDt getSite();

   public IQICoreImmunization setSite(CodeableConceptDt param);

   public CodeableConceptDt getVaccineCode();

   public IQICoreImmunization setVaccineCode(CodeableConceptDt param);

   public List<AnnotationDt> getNote();

   public IQICoreImmunization setNote(List<AnnotationDt> param);

   public IQICoreImmunization addNote(AnnotationDt param);

   public AnnotationDt addNote();

   public AnnotationDt getNoteFirstRep();

   public IdDt getId();

   public IQICoreImmunization setId(IdDt param);

   public QICoreOrganizationAdapter getManufacturerResource();

   public IQICoreImmunization setManufacturerResource(
         QICoreOrganizationAdapter param);

   public String getStatus();

   public IQICoreImmunization setStatus(String param);

   public CodeDt getStatusElement();

   public IQICoreImmunization setStatus(CodeDt param);

   public List<IdentifierDt> getIdentifier();

   public IQICoreImmunization setIdentifier(List<IdentifierDt> param);

   public IQICoreImmunization addIdentifier(IdentifierDt param);

   public IdentifierDt addIdentifier();

   public IdentifierDt getIdentifierFirstRep();
}