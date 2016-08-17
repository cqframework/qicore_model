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

public interface IQICoreCommunicationRequest
{

   public CommunicationRequest getAdaptee();

   public void setAdaptee(CommunicationRequest param);

   public ContainedDt getContained();

   public IQICoreCommunicationRequest setContained(ContainedDt param);

   public CodeDt getLanguage();

   public IQICoreCommunicationRequest setLanguage(CodeDt param);

   public CodeableConceptDt getReasonRejected();

   public IQICoreCommunicationRequest setReasonRejected(CodeableConceptDt param);

   public List<CommunicationRequest.Payload> getPayload();

   public IQICoreCommunicationRequest setPayload(
         List<CommunicationRequest.Payload> param);

   public IQICoreCommunicationRequest addPayload(
         CommunicationRequest.Payload param);

   public CommunicationRequest.Payload addPayload();

   public CommunicationRequest.Payload getPayloadFirstRep();

   public CodeableConceptDt getPriority();

   public IQICoreCommunicationRequest setPriority(CodeableConceptDt param);

   public QICoreEncounterAdapter getEncounterResource();

   public IQICoreCommunicationRequest setEncounterResource(
         QICoreEncounterAdapter param);

   public DateTimeDt getRequestedOnElement();

   public Date getRequestedOn();

   public IQICoreCommunicationRequest setRequestedOn(Date param);

   public IQICoreCommunicationRequest setRequestedOn(DateTimeDt param);

   public String getStatus();

   public IQICoreCommunicationRequest setStatus(String param);

   public IQICoreCommunicationRequest setStatus(
         CommunicationRequestStatusEnum param);

   public BoundCodeDt<CommunicationRequestStatusEnum> getStatusElement();

   public IQICoreCommunicationRequest setStatus(
         BoundCodeDt<CommunicationRequestStatusEnum> param);

   public NarrativeDt getText();

   public IQICoreCommunicationRequest setText(NarrativeDt param);

   public Patient getSubjectResource();

   public IQICoreCommunicationRequest setSubjectResource(Patient param);

   public List<IdentifierDt> getIdentifier();

   public IQICoreCommunicationRequest setIdentifier(List<IdentifierDt> param);

   public IQICoreCommunicationRequest addIdentifier(IdentifierDt param);

   public IdentifierDt addIdentifier();

   public IdentifierDt getIdentifierFirstRep();

   public CodeableConceptDt getCategory();

   public IQICoreCommunicationRequest setCategory(CodeableConceptDt param);

   public DateTimeDt getScheduledDateTimeElement();

   public Date getScheduledDateTime();

   public IQICoreCommunicationRequest setScheduledDateTime(DateTimeDt param);

   public IQICoreCommunicationRequest setScheduledDateTime(Date param);

   public PeriodDt getScheduledPeriod();

   public IQICoreCommunicationRequest setScheduledPeriod(PeriodDt param);

   public IdDt getId();

   public IQICoreCommunicationRequest setId(IdDt param);
}