package org.socraticgrid.fhir.generated;

import ca.uhn.fhir.model.dstu2.resource.Encounter;
import ca.uhn.fhir.model.api.ExtensionDt;
import java.util.List;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.valueset.EncounterClassEnum;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.primitive.BoundCodeDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.composite.NarrativeDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.composite.IdentifierDt;
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
import ca.uhn.fhir.model.dstu2.resource.Organization;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.composite.ContainedDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.primitive.CodeDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.composite.CodeableConceptDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.Patient;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.composite.DurationDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.Appointment;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.primitive.IdDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.valueset.EncounterStateEnum;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.composite.PeriodDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;

public interface IEncounter
{

   public Encounter getAdaptee();

   public void setAdaptee(Encounter param);

   public String getClassElement();

   public IEncounter setClassElement(String param);

   public IEncounter setClassElement(EncounterClassEnum param);

   public BoundCodeDt<EncounterClassEnum> getClassElementElement();

   public IEncounter setClassElement(BoundCodeDt<EncounterClassEnum> param);

   public NarrativeDt getText();

   public IEncounter setText(NarrativeDt param);

   public List<IdentifierDt> getIdentifier();

   public IEncounter setIdentifier(List<IdentifierDt> param);

   public IEncounter addIdentifier(IdentifierDt param);

   public IdentifierDt addIdentifier();

   public IdentifierDt getIdentifierFirstRep();

   public Encounter.Hospitalization getHospitalization();

   public IEncounter setHospitalization(Encounter.Hospitalization param);

   public Encounter getPartOfResource();

   public IEncounter setPartOfResource(Encounter param);

   public List<Encounter.StatusHistory> getStatusHistory();

   public IEncounter setStatusHistory(List<Encounter.StatusHistory> param);

   public IEncounter addStatusHistory(Encounter.StatusHistory param);

   public Encounter.StatusHistory addStatusHistory();

   public Encounter.StatusHistory getStatusHistoryFirstRep();

   public List<Encounter.Participant> getParticipant();

   public IEncounter setParticipant(List<Encounter.Participant> param);

   public IEncounter addParticipant(Encounter.Participant param);

   public Encounter.Participant addParticipant();

   public Encounter.Participant getParticipantFirstRep();

   public List<Encounter.Location> getLocation();

   public IEncounter setLocation(List<Encounter.Location> param);

   public IEncounter addLocation(Encounter.Location param);

   public Encounter.Location addLocation();

   public Encounter.Location getLocationFirstRep();

   public Organization getServiceProviderResource();

   public IEncounter setServiceProviderResource(Organization param);

   public ContainedDt getContained();

   public IEncounter setContained(ContainedDt param);

   public CodeDt getLanguage();

   public IEncounter setLanguage(CodeDt param);

   public CodeableConceptDt getPriority();

   public IEncounter setPriority(CodeableConceptDt param);

   public Patient getPatientResource();

   public IEncounter setPatientResource(Patient param);

   public DurationDt getLength();

   public IEncounter setLength(DurationDt param);

   public Appointment getAppointmentResource();

   public IEncounter setAppointmentResource(Appointment param);

   public IdDt getId();

   public IEncounter setId(IdDt param);

   public String getStatus();

   public IEncounter setStatus(String param);

   public IEncounter setStatus(EncounterStateEnum param);

   public BoundCodeDt<EncounterStateEnum> getStatusElement();

   public IEncounter setStatus(BoundCodeDt<EncounterStateEnum> param);

   public PeriodDt getPeriod();

   public IEncounter setPeriod(PeriodDt param);
}