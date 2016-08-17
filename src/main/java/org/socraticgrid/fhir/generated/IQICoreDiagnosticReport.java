package org.socraticgrid.fhir.generated;

import ca.uhn.fhir.model.dstu2.resource.DiagnosticReport;
import ca.uhn.fhir.model.api.ExtensionDt;
import java.util.List;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.composite.IdentifierDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.primitive.InstantDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import java.util.Date;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.composite.ResourceReferenceDt;
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
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.composite.AttachmentDt;
import ca.uhn.fhir.model.dstu2.resource.*;
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
import ca.uhn.fhir.model.dstu2.valueset.DiagnosticReportStatusEnum;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.primitive.BoundCodeDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.composite.ContainedDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.composite.NarrativeDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.primitive.StringDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.primitive.CodeDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.primitive.DateTimeDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.composite.PeriodDt;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.dstu2.resource.*;

public interface IQICoreDiagnosticReport
{

   public DiagnosticReport getAdaptee();

   public void setAdaptee(DiagnosticReport param);

   public List<IdentifierDt> getIdentifier();

   public IQICoreDiagnosticReport setIdentifier(List<IdentifierDt> param);

   public IQICoreDiagnosticReport addIdentifier(IdentifierDt param);

   public IdentifierDt addIdentifier();

   public IdentifierDt getIdentifierFirstRep();

   public InstantDt getIssuedElement();

   public Date getIssued();

   public IQICoreDiagnosticReport setIssued(Date param);

   public IQICoreDiagnosticReport setIssued(InstantDt param);

   public ResourceReferenceDt getLocationPerformed();

   public IQICoreDiagnosticReport setLocationPerformed(
         ResourceReferenceDt param);

   public IdDt getId();

   public IQICoreDiagnosticReport setId(IdDt param);

   public List<DiagnosticReport.Image> getImage();

   public IQICoreDiagnosticReport setImage(List<DiagnosticReport.Image> param);

   public IQICoreDiagnosticReport addImage(DiagnosticReport.Image param);

   public DiagnosticReport.Image addImage();

   public DiagnosticReport.Image getImageFirstRep();

   public QICoreEncounterAdapter getEncounterResource();

   public IQICoreDiagnosticReport setEncounterResource(
         QICoreEncounterAdapter param);

   public List<AttachmentDt> getPresentedForm();

   public IQICoreDiagnosticReport setPresentedForm(List<AttachmentDt> param);

   public IQICoreDiagnosticReport addPresentedForm(AttachmentDt param);

   public AttachmentDt addPresentedForm();

   public AttachmentDt getPresentedFormFirstRep();

   public CodeableConceptDt getCode();

   public IQICoreDiagnosticReport setCode(CodeableConceptDt param);

   public CodeableConceptDt getCategory();

   public IQICoreDiagnosticReport setCategory(CodeableConceptDt param);

   public String getStatus();

   public IQICoreDiagnosticReport setStatus(String param);

   public IQICoreDiagnosticReport setStatus(DiagnosticReportStatusEnum param);

   public BoundCodeDt<DiagnosticReportStatusEnum> getStatusElement();

   public IQICoreDiagnosticReport setStatus(
         BoundCodeDt<DiagnosticReportStatusEnum> param);

   public ContainedDt getContained();

   public IQICoreDiagnosticReport setContained(ContainedDt param);

   public NarrativeDt getText();

   public IQICoreDiagnosticReport setText(NarrativeDt param);

   public StringDt getConclusionElement();

   public String getConclusion();

   public IQICoreDiagnosticReport setConclusion(String param);

   public IQICoreDiagnosticReport setConclusion(StringDt param);

   public CodeDt getLanguage();

   public IQICoreDiagnosticReport setLanguage(CodeDt param);

   public DateTimeDt getEffectiveDateTimeElement();

   public Date getEffectiveDateTime();

   public IQICoreDiagnosticReport setEffectiveDateTime(DateTimeDt param);

   public IQICoreDiagnosticReport setEffectiveDateTime(Date param);

   public PeriodDt getEffectivePeriod();

   public IQICoreDiagnosticReport setEffectivePeriod(PeriodDt param);
}