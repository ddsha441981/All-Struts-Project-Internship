<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <section id="doctor" class="home-section bg-gray paddingbot-60">
		<div class="container marginbot-50">
			<div class="row">
				<div class="col-lg-8 col-lg-offset-2">
					<div class="wow fadeInDown" data-wow-delay="0.1s">
					<div class="section-heading text-center">
					<h2 class="h-bold">Doctors</h2>
					<p>Ea melius ceteros oportere quo, pri habeo viderer facilisi ei</p>
					</div>
					</div>
					<div class="divider-short"></div>
				</div>
			</div>
		</div>
		
		<div class="container">
			<div class="row">
				<div class="col-lg-12">
				
            <div id="filters-container" class="cbp-l-filters-alignLeft">
                <div data-filter="*" class="cbp-filter-item-active cbp-filter-item">All (<div class="cbp-filter-counter"></div>)</div>
                <div data-filter=".cardiologist" class="cbp-filter-item">Cardiologist (<div class="cbp-filter-counter"></div>)</div>
                <div data-filter=".psychiatrist" class="cbp-filter-item">Psychiatrist (<div class="cbp-filter-counter"></div>)</div>
                <div data-filter=".neurologist" class="cbp-filter-item">Neurologist (<div class="cbp-filter-counter"></div>)</div>
            </div>
		
            <div id="grid-container" class="cbp-l-grid-team">
                <ul>
                    <li class="cbp-item psychiatrist">
                        <a href="doctors/member1.jsp" class="cbp-caption cbp-singlePage">
                            <div class="cbp-caption-defaultWrap">
                                <img src="img/team/1.jpg" alt="" width="100%">
                            </div>
                            <div class="cbp-caption-activeWrap">
                                <div class="cbp-l-caption-alignCenter">
                                    <div class="cbp-l-caption-body">
                                        <div class="cbp-l-caption-text">VIEW PROFILE</div>
                                    </div>
                                </div>
                            </div>
                        </a>
                        <a href="doctors/member1.jsp" class="cbp-singlePage cbp-l-grid-team-name">Alice Grue</a>
                        <div class="cbp-l-grid-team-position">Psychiatrist</div>
                         <s:form action="memmer1">
                         <div class="cbp-l-grid-team-position">
                         
                         <s:submit value="Show Profile"></s:submit>
                        
                         </div> </s:form>
                    </li>
                    <li class="cbp-item cardiologist">
                        <a href="doctors/member2.jsp" class="cbp-caption cbp-singlePage">
                            <div class="cbp-caption-defaultWrap">
                                <img src="img/team/2.jpg" alt="" width="100%">
                            </div>
                            <div class="cbp-caption-activeWrap">
                                <div class="cbp-l-caption-alignCenter">
                                    <div class="cbp-l-caption-body">
                                        <div class="cbp-l-caption-text">VIEW PROFILE</div>
                                    </div>
                                </div>
                            </div>
                        </a>
                        <a href="doctors/member3.jsp" class="cbp-singlePage cbp-l-grid-team-name">Joseph Murphy</a>
                        <div class="cbp-l-grid-team-position">Cardiologist</div>
                         <div class="cbp-l-grid-team-position"> <input type="submit" name="profile"></div>
                    </li>
                    
                    <li class="cbp-item cardiologist">
                        <a href="doctors/member3.jsp" class="cbp-caption cbp-singlePage">
                            <div class="cbp-caption-defaultWrap">
                                <img src="img/team/3.jpg" alt="" width="100%">
                            </div>
                            <div class="cbp-caption-activeWrap">
                                <div class="cbp-l-caption-alignCenter">
                                    <div class="cbp-l-caption-body">
                                        <div class="cbp-l-caption-text">VIEW PROFILE</div>
                                    </div>
                                </div>
                            </div>
                        </a>
                        <a href="doctors/member4.jsp" class="cbp-singlePage cbp-l-grid-team-name">Alison Davis</a>
                        <div class="cbp-l-grid-team-position">Cardiologist</div>
                         <div class="cbp-l-grid-team-position"> <input type="submit" name="profile"></div>
                    </li>
                    <li class="cbp-item neurologist">
                        <a href="doctors/member4.jsp" class="cbp-caption cbp-singlePage">
                            <div class="cbp-caption-defaultWrap">
                                <img src="img/team/4.jpg" alt="" width="100%">
                            </div>
                            <div class="cbp-caption-activeWrap">
                                <div class="cbp-l-caption-alignCenter">
                                    <div class="cbp-l-caption-body">
                                        <div class="cbp-l-caption-text">VIEW PROFILE</div>
                                    </div>
                                </div>
                            </div>
                        </a>
                        <a href="doctors/member4.jsp" class="cbp-singlePage cbp-l-grid-team-name">Adam Taylor</a>
                        <div class="cbp-l-grid-team-position">Neurologist</div>
                        <div class="cbp-l-grid-team-position"> <input type="submit" name="profile"></div>
                    </li>

                </ul>
            </div>
			</div>
			</div>
		</div>

	</section>

</body>
</html>