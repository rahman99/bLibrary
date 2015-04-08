<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>

<div class="navbar-default sidebar" role="navigation">
	<div class="sidebar-nav navbar-collapse">
		<ul class="nav" id="side-menu">
			<li class="sidebar-search">
				<div class="input-group custom-search-form">
					<input type="text" class="form-control" placeholder="Search">
					<span class="input-group-btn">
						<button class="btn btn-default" type="button">
							<i class="fa fa-search"></i>
						</button>
					</span>
				</div>
			</li>			
			<li class="active"><a href="about">Dashboard</a>
			</li>
<!-- looping yang diambil dari table -->
						
			<%-- 
			<c:forEach var="user" items="${userList}">
				<li><a href="">${user.username}</a></li>
			</c:forEach>
			 --%>
			<li><a href="userLogin">Administrator</a></li>
			<li><a href="listBooks">Book</a>
			</li>
			<li><a href="Members">Member</a>
			</li>
			<li><a href="#">Peminjaman</a>
			</li>
			<li><a href="#">Pengembalian</a>
			</li>
			<!-- 
			<li><a href="#">Charts<span class="fa arrow"></span></a>
				<ul class="nav nav-second-level">
					<li><a href="flot.html">Flot Charts</a></li>
					<li><a href="morris.html">Morris.js Charts</a></li>
				</ul>
			</li>
			<li><a href="#"> UI Elements<span class="fa arrow"></span></a>
				<ul class="nav nav-second-level">
					<li><a href="panels-wells.html">Panels and Wells</a></li>
					<li><a href="buttons.html">Buttons</a></li>
					<li><a href="notifications.html">Notifications</a></li>
					<li><a href="typography.html">Typography</a></li>
					<li><a href="grid.html">Grid</a></li>
				</ul>
			</li>
			<li><a href="#">Multi-Level Dropdown<span class="fa arrow"></span></a>
				<ul class="nav nav-second-level">
					<li><a href="#">Second Level Item</a></li>
					<li><a href="#">Second Level Item</a></li>
					<li><a href="#">Third Level <span class="fa arrow"></span></a>
						<ul class="nav nav-third-level">
							<li><a href="#">Third Level Item</a></li>
							<li><a href="#">Third Level Item</a></li>
							<li><a href="#">Third Level Item</a></li>
							<li><a href="#">Third Level Item</a></li>
						</ul> 
					</li>
				</ul>
			</li>
			<li class="#"><a href="#">Sample Pages<span class="fa arrow"></span></a>
				<ul class="nav nav-second-level">
					<li><a class="active" href="blank.html">Blank Page</a></li>
					<li><a href="login.html">Login Page</a></li>
				</ul>
			</li>
			 -->
		</ul>
	</div>
</div>