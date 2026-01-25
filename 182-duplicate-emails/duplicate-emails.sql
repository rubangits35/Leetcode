select email from person
group by email
Having Count(email)>1;