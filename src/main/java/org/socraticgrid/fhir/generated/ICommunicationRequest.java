package org.socraticgrid.fhir.generated;

import ca.uhn.fhir.model.dstu2.resource.CommunicationRequest;
import ca.uhn.fhir.model.api.ExtensionDt;
import java.util.List;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.composite.ContainedDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.primitive.CodeDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.composite.CodeableConceptDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.Encounter;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.primitive.DateTimeDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import java.util.Date;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.valueset.CommunicationRequestStatusEnum;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.primitive.BoundCodeDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.composite.NarrativeDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.Patient;
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
import ca.uhn.fhir.model.dstu2.composite.PeriodDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.primitive.IdDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;

public interface ICommunicationRequest
{

   public CommunicationRequest getAdaptee();

   public void setAdaptee(CommunicationRequest param);

   public ContainedDt getContained();

   public ICommunicationRequest setContained(ContainedDt param);

   public CodeDt getLanguage();

   public ICommunicationRequest setLanguage(CodeDt param);

   public List<CommunicationRequest.Payload> getPayload();

   public ICommunicationRequest setPayload(
         List<CommunicationRequest.Payload> param);

   public ICommunicationRequest addPayload(CommunicationRequest.Payload param);

   public CommunicationRequest.Payload addPayload();

   public CommunicationRequest.Payload getPayloadFirstRep();

   public CodeableConceptDt getPriority();

   public ICommunicationRequest setPriority(CodeableConceptDt param);

   public Encounter getEncounterResource();

   public ICommunicationRequest setEncounterResource(Encounter param);

   public DateTimeDt getRequestedOnElement();

   public Date getRequestedOn();

   public ICommunicationRequest setRequestedOn(Date param);

   public ICommunicationRequest setRequestedOn(DateTimeDt param);

   public String getStatus();

   public ICommunicationRequest setStatus(String param);

   public ICommunicationRequest setStatus(CommunicationRequestStatusEnum param);

   public BoundCodeDt<CommunicationRequestStatusEnum> getStatusElement();

   public ICommunicationRequest setStatus(
         BoundCodeDt<CommunicationRequestStatusEnum> param);

   public NarrativeDt getText();

   public ICommunicationRequest setText(NarrativeDt param);

   public Patient getSubjectResource();

   public ICommunicationRequest setSubjectResource(Patient param);

   public List<IdentifierDt> getIdentifier();

   public ICommunicationRequest setIdentifier(List<IdentifierDt> param);

   public ICommunicationRequest addIdentifier(IdentifierDt param);

   public IdentifierDt addIdentifier();

   public IdentifierDt getIdentifierFirstRep();

   public CodeableConceptDt getCategory();

   public ICommunicationRequest setCategory(CodeableConceptDt param);

   public DateTimeDt getScheduledDateTimeElement();

   public Date getScheduledDateTime();

   public ICommunicationRequest setScheduledDateTime(DateTimeDt param);

   public ICommunicationRequest setScheduledDateTime(Date param);

   public PeriodDt getScheduledPeriod();

   public ICommunicationRequest setScheduledPeriod(PeriodDt param);

   public IdDt getId();

   public ICommunicationRequest setId(IdDt param);
}